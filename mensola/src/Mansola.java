

public class Mansola {

    private Libro[] libri;
    private int dimLog=0;
    private final int DIM=20;

    public Mansola() {
        //DA COMPLETARE
    this.libri = new Libro[DIM];

    }

    public void aggiungiLibro(Libro libro) {
        //DA COMPLETARE
        libri[dimLog] = libro;
        dimLog++;

    }

    public int cercaLibro(Libro libro) {
        //DA COMPLETARE
        int posizione = 0;
        for(int i = 0;i<dimLog;i++){
            
            if(libri[i].equals(libro)){
                posizione=i;
            }
        }
        return posizione;
    }

    public void eliminaLibro(Libro libro) {
        //DA COMPLETARE
            int libroDaEliminare = cercaLibro(libro);
        for(int i = libroDaEliminare; i < dimLog - 1; i++) {
            libri[i] = libri[i + 1];
        }
        dimLog--;
    }
    @Override
    public String toString() {
        String stringa="";
        for(int i=0;i<dimLog;i++){
            stringa += libri[i].getCodice();
            stringa += ", ";
        }
        return stringa;
    }

}
