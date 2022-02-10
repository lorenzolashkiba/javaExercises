import java.util.ArrayList;

public class AnotherList {

    private ArrayList<Libro> lista;

    public AnotherList(){
        lista = new ArrayList<Libro>();
    }

    public void aggiungiLibro(Libro libro){
        lista.add(libro);
        //lista.add(new Libro("as",4));
        lista.add(2,libro);
    }

    public void rimuovi(Libro libro){
        lista.remove(libro);
    }

}
