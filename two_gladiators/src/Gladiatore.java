public class Gladiatore {

    private int puntiFerita;
    private Arma arma;
    private  Armatura armatura;
    private int hpMax;
    private boolean arresoo ;
    public Gladiatore(int puntiFerita,int dannoArma,int tipoDannoArma,int riduzioneDanno,int riduzioneTipoDanno,int tipoArmatura){
        this.puntiFerita = puntiFerita;
        arma = new Arma(dannoArma,tipoDannoArma);
        armatura = new Armatura(riduzioneDanno,riduzioneTipoDanno,tipoArmatura);
        hpMax = this.puntiFerita;
        arresoo = false;
    }
    public Arma getArma(){
        return arma;
    }

    public int getPuntiFerita() {
        return puntiFerita;
    }

    public boolean vivo(){
        if(puntiFerita>0){
            return  true;
        }else return false;
    }

    public int colpisci(){
        return arma.getDanno();
    }

    public void subisci(int danno,int tipoDanno){
        int subito;
        if(armatura.getTipoArmatura() == tipoDanno){
            subito = armatura.getRiduzioneTipoDanno() - danno;
        }else subito = armatura.getRiduzioneDanno() - danno;

        if(subito<0) {
            puntiFerita = puntiFerita + subito;
        }
    }

    public boolean arreso(){

        double current = Math.random() * hpMax;

        System.out.println("current = " + current + " \n hp = "+ puntiFerita);
         if(puntiFerita < current){
             System.out.println(" mi sono arreso.");
             arresoo = true;
         }else arresoo = false;

    return arresoo;
    }

    public boolean isArresoo() {
        return arresoo || puntiFerita<=0;
    }

    public String toString(){
        return " punti ferita = " + puntiFerita+ " \n Arma :" + arma.toStringArma() + " \n Armatura : "+armatura.toStringArmatura();
    }

}
