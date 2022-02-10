public class DadoTruccato extends Dado{
    public DadoTruccato(int facce){
        super(facce);
    }
    public int randomFaccia(){
        int range = numeroFacce - numeroFacce/2;
        randNumero = (int)(Math.random() * range) + numeroFacce/2;
        return  randNumero;
    }

}
