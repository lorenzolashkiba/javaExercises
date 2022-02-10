public class Duellante extends Gladiator {

    protected Duellante(int maxHealth,Armatura armatura,Arma arma,boolean leggera){
        super(maxHealth,armatura,arma,leggera);
    }
    public int hit(int damage){

        return damage;
    }
    @Override
    public void damage(int damage, String ArmaType) {
        if(!dodge(armatura.getLeggera()+10)) {
            if(isArmaturaLeggera()){
                damage+= (damage*(armatura.getLeggera())+10)/100;
            }
            damage -= armatura.getProtezioneGenerale();
            if (ArmaType.equals(armatura.getProtezioneSpecializzata())) {
                damage -= armatura.getProtezioneDannoS();
            }
            if (damage > 0) {
                setCurrHealth(getCurrHealth() - damage);
            }
        }
    }
    @Override
    public String toString() {
        return dodged? "DUELLANTE HA SCHIVATO":"DUELLANTE ";
    }


}
