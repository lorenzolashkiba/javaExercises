public class Notebook extends Prodotti{
    private int peso,schermo;
    public Notebook(int processore, int memoria,int hardisk,boolean rom,double codiceProdotto, double prezzo,int peso,int schermo){
        super(processore,memoria, hardisk,rom, codiceProdotto, prezzo);
        this.peso = peso;
        this.schermo = schermo;
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "peso=" + peso +
                ", schermo=" + schermo + super.toString()+
                '}';
    }
}
