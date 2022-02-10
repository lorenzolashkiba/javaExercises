public class Samurai extends Gladiator{

    //contructor
    public Samurai(int maxHealth,Armatura armatura,Arma arma,boolean leggera){
        super(maxHealth,armatura,arma,leggera);
    }

    public int hit(int damage){
        if(isArmaMastodontica()){
          double rand = Math.random();
          if(rand<0.1){
              damage*=0.5;
          }else if(rand<0.2){
              damage *=1.5;
          }
        }
        return damage;
    }


    @Override
    public void damage(int damage, String ArmaType) {
       if(!dodge(armatura.getLeggera())) {
           if(isArmaturaLeggera()){
                damage+= (damage*armatura.getLeggera())/100;
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
    public int isSurrended(){

        return super.isSurrended()>-1?super.isSurrended()>-1? 0:-1 :-1;

    }
    @Override
    public String toString() {

        return dodged? "SAMURAI HA SCHIVATO":"SAMURAI";
    }
}
