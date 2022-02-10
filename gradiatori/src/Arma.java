public enum Arma {

    KATANA(1,"KATANA","Tagliente",10),
    LANCIA(2,"LANCIA DI ROCKS","Perforante",14),
    MJOLNIR(3,"MJOLNIR","Contundente",15);
    private final int identificativo;
    private final String tipoArma;
    private final String tipoDanno;
    private final int danno;



    Arma(int identificativo,String tipoArma, String tipoDanno,int danno){
        this.identificativo = identificativo;
        this.danno = danno;
        this.tipoDanno = tipoDanno;

        this.tipoArma = tipoArma;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public int getDanno() {
        return danno;
    }

    public String getTipoDanno() {
        return tipoDanno;
    }

    @Override
    public String toString() {
        return identificativo+ "." + tipoArma+"{" + '\n'+
                "tipoDanno=" + tipoDanno  +
                ", danno=" + danno +
                '}';
    }

}
