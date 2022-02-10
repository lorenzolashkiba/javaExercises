public class Berserk extends Gladiator{

    private int berserkCont=0;
    private boolean berserk=false;
    private int i=0;

    public Berserk(int maxHealth,Armatura armatura,Arma arma,boolean leggera){
        super(maxHealth,armatura,arma,leggera);
    }

    public int hit(int damage){
            if(berserkCont>0){
                damage += (damage*20)/100;
            }
        return damage;
    }
    //ho qualche dubbio sul codice che lo fa diventare berserk
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

            if (!berserk) {
                berserkCont = Math.random() < 0.25 ? 1 : 0;
                if (berserkCont > 0) {
                    berserk = true;

                    berserkCont = damage;
                }
            }
            if (berserkCont > 0) {
                i++;
                damage -= (damage * 10) / 100;
            }
            if (damage > 0) {

                setCurrHealth(getCurrHealth() - damage);

            }
        }
        berserkCont--;
    }
    @Override
    public int isSurrended(){
            return berserk? -1 : super.isSurrended();
    }
    @Override
    public String toString() {

        return dodged? "BERSERK HA SCHIVATO": berserk&&i==1? "BERSERK ENTRATO IN MODALITA BERSERK PER "+berserkCont+"TURNI":"BERSERK"  ;
    }
}
