public abstract class Gladiator {

    private int maxHealth;
    private int currHealth;
    private int surrended;
    protected Armatura armatura;
    protected Arma arma;
    private boolean armaturaLeggera;
    private boolean armaMastodontica;
    protected boolean dodged;

    //contructor
    protected Gladiator(int maxHealth,Armatura armatura,Arma arma,boolean armaturaLeggera){
        this.maxHealth = maxHealth;
        this.currHealth = maxHealth;
        this.armatura = armatura;
        this.arma = arma;
        this.armaturaLeggera = armaturaLeggera;
    }

    //abstract methods
    //metodo damage toglie l'ammontare di danno al gladiatore
    abstract void damage(int damage,String ArmaType);
    //metodo hit ritorna l'ammontare di danno che colpirà
    abstract int hit(int damage);

    //checks if gladiator has surrended
    protected int isSurrended(){
        surrended = Math.random()*maxHealth>currHealth ?  0 : -1;
        return surrended;
    }

        // get/set methods
    protected int getCurrHealth() {
        return currHealth;
    }
    protected boolean isArmaturaLeggera(){
        return armaturaLeggera;
    }
    protected boolean isArmaMastodontica() {
        return armaMastodontica;
    }
    protected void setCurrHealth(int currHealth) {
        this.currHealth = currHealth;
    }
    protected int getSurrended(){
        return surrended;
    }

    //metodo dodge controlla se ha schivato il colpo ritorna un booleano
    protected boolean dodge(int armaturaLegr){
        if(armaturaLeggera){

            if(armaMastodontica){
                if(Math.random()*100<10){
                    dodged = true;
                    return true;
                }
            }
            if(Math.random()*100<armaturaLegr){
                dodged = true;
                return true;
            }
        }
        dodged = false;
        return false;
    }

}
