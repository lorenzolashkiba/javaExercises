public class Pc extends Prodotti{

    public Pc(int processore, int memoria,int hardisk,boolean rom,double codiceProdotto, double prezzo){
      super( processore,  memoria, hardisk,rom, codiceProdotto, prezzo);
    }

    @Override
    public String toString() {
        return  "PC{"+super.toString();
    }
}
