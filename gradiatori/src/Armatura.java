public enum Armatura {

    PRINCIPIANTE(2,"Tagliente",3,1,"ARMATURA DA PRINCIPIANTI",50),
    GIAPPONESE(5,"Contundente",3,2,"ARMATURA GIAPPONESE",30),
    BERSERK(8,"Perforante",3,3,"ARMATURA DEL BERSERK",10);

    private final int protezioneGenerale;
    private final String protezioneSpecializzata;
    private final int protezioneDannoS;
    private final int identificativo;
    private final String tipo;
    private final int leggera;

     Armatura(int protezioneGenerale,String protezioneSpecializzata,int protezioneDannoS, int identificativo,String tipo,int leggera){
        this.protezioneGenerale = protezioneGenerale;
        this.protezioneSpecializzata = protezioneSpecializzata;
        this.protezioneDannoS = protezioneDannoS;
        this.identificativo = identificativo;
        this.tipo = tipo;
        this.leggera = leggera;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public int getProtezioneDannoS() {
        return protezioneDannoS;
    }

    public int getLeggera() {
        return leggera;
    }

    public int getProtezioneGenerale() {
        return protezioneGenerale;
    }

    public String getProtezioneSpecializzata() {
        return protezioneSpecializzata;
    }

    @Override
    public String toString() {
        return  identificativo + "."+
                 tipo +'{'+'\n'+
                "protezioneGenerale=" + protezioneGenerale +
                ", protezioneSpecializzata=" + protezioneSpecializzata +' '+ protezioneDannoS+ '\n'+ "se leggera :" +leggera+"%"+ '}';
    }
}
