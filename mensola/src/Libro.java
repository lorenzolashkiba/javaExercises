class Libro{
    private int codice;
    private String[] autore;
    private int[] annoPubblicazioni;
    private String titolo;
    private final int DIM=5;
    private int dimLog=0;

    public Libro(int codice, String titolo) {
        this.codice = codice;
        this.titolo = titolo;
        autore=new String[DIM];
        annoPubblicazioni=new int[DIM];
    }

    public Libro(int codice, String[] autore, String titolo) {
        this.codice = codice;
        this.autore = autore;
        this.titolo = titolo;
        annoPubblicazioni=new int[DIM];
    }

    public int getCodice() {
        return codice;
    }

    public String[] getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setAutore(String[] autore) {
        this.autore = autore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public void setAnnoPubblicazioni(int anno) {
        if(dimLog<DIM) {
            annoPubblicazioni[dimLog]=anno;
            dimLog++;
        }
    }

    @Override
    public String toString() { //crea una stringa
        String stringa="";
        for (int i = 0; i < autore.length; i++) {
            if(autore[i]!=null)
                stringa+=" "+autore[i];
        }
        for (int i = 0; i < annoPubblicazioni.length; i++) {
            if(annoPubblicazioni[i]!=0)
                stringa+=" "+annoPubblicazioni[i];
        }
        return codice+"\t"+stringa+"\t"+titolo;
    }

    @Override
    public boolean equals(Object libro) {
        return this.codice==((Libro) libro).codice;
    }
}