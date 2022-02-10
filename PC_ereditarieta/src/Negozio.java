public class Negozio {

    private Prodotti[] prodotti;
    private static int numeroP=100;
    private int currP = 0;
    public Negozio(){
        prodotti = new Prodotti[numeroP];
        currP = 0;
    }

    public void addProdotto(Prodotti p){
        prodotti[currP] = p;
        currP++;
    }

    public String toString(){
        String string = new String();
        for (int i = 0; i < currP; i++) {
            string += prodotti[i].toString();
            string += "\n";
        }
        return string;
    }
    public void eliminaProdotto(int codice) throws ProductNotFoundException{
        int i = trovaProdotto(codice);
        if(i!=-1){
            prodotti[i] = prodotti[currP-1];
            currP--;
        }
    }
    public int trovaProdotto(int codice) throws ProductNotFoundException{
        for (int i = 0; i < currP; i++) {
            if(prodotti[i].getCodiceProdotto() == codice){
                return  i;
            }
        }
        throw new ProductNotFoundException(codice);
    }
    public String stampaPc(){
        String string  = new String();
        for (int i = 0; i <currP ; i++) {

            if(prodotti[i] instanceof Pc){
                Pc c = (Pc) prodotti[i];
                string += c.toString()+"\n";
            }
        }
        return string;
    }
    public void eliminaPc(int codice) throws ProductNotFoundException{
        int i = trovaPc(codice);
        prodotti[i] = prodotti[currP-1];
        currP--;
    }
    public int trovaPc(int codice) throws ProductNotFoundException{
        for (int i = 0; i <currP ; i++) {
            if(prodotti[i] instanceof Pc){
                if(prodotti[i].getCodiceProdotto() == codice){
                    return  i;
                }
            }
        }
        throw new ProductNotFoundException(codice);
    }
}
