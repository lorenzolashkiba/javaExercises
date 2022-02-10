public class Data {

    private int giorno,mese,anno;

    public Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    public Data(int giorno, int mese){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = 2021;
    }
    public Data(){
        this.giorno = 1;
        this.mese = 1;
        this.anno = 1900;
    }

    public int getAnno() {
        return anno;
    }

    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public boolean tipoAnno(int anno){
        if(anno%4==0){
            if(anno%100==0){
                if(anno%400==0){
                    return true;
                }else return false;
            }else return true;
        }else return false;
    }

    public int distanzaDa(int giorno,int mese){
        int distanza=0;
        for(int i = mese;i<this.mese;i++){
            distanza+=30;
        }
        distanza += this.giorno-giorno;
        return distanza;
    }
    public int distanzaDaData(Data data){
        int distanza=0;
        if(tipoAnno(this.anno)) distanza +=1;

        for(int j = data.anno;j<this.anno;j++) {
            distanza += 365;
            if(tipoAnno(j)) distanza +=1;
        }
        distanza -= distanzaDa(data.giorno,data.mese);

        return distanza;
    }
    @Override
    public String toString(){

        return giorno + "/" + mese +"/"+anno;
    }
}
