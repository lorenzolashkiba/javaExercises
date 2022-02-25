

public class Negozio {
    int matite;
    int quaderni;
    Fornitore fornitore;

    public Negozio(int matite, int quaderni){
        this.matite = matite;
        this.quaderni = quaderni;
        fornitore = new Fornitore(this);
        Thread thread = new Thread(fornitore);
        thread.start();
    }

    public int getMatite() {
        return matite;
    }

    public int getQuaderni() {
        return quaderni;
    }

    public int takeMatita(int a){

        if(matite>a){
            matite-=a;
            return a;
        }else return matite;
    }
    public int takeQuaderno(int a){

        if(quaderni>a){
            quaderni-=a;
            return a;
        }else return quaderni;
    }
    public synchronized void buy(int matite,int quaderni){
        takeQuaderno(quaderni);
        takeMatita(matite);
    }
    public synchronized void rifornisci(int matite,int quaderni){
        setQuaderni(quaderni+getQuaderni());
        setMatite(matite+getMatite());
    }
    public void setMatite(int matite) {
        this.matite = matite;
    }

    public void setQuaderni(int quaderni) {
        this.quaderni = quaderni;
    }

    @Override
    public String toString() {
        return "Negozio{" +
                "matite=" + matite +
                ", quaderni=" + quaderni +
                '}';
    }
}
