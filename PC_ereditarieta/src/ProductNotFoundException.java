public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(int codice){
        super("il prodotto nn esiste :"+codice);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
