public class Dado {
    int numeroFacce;
    int randNumero;
    public Dado(int facce){
       numeroFacce = facce;
    }

    public int randomFaccia(){
        randNumero = (int)(Math.random() * numeroFacce) + 1;
        return  randNumero;
    }

    public int getRandNumero() {
        return randNumero;
    }
}
