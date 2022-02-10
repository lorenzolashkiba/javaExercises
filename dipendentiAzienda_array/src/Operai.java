public class Operai extends Personale{

   private String mansione;
    private String reparto;

    public Operai(String nome, String cognome, int matricola, int retribuzioneOraria,int numeroTelefono,String mansione,String reparto){
        super( nome,cognome, matricola, retribuzioneOraria,numeroTelefono);
        this.mansione = mansione;
        this.reparto = reparto;
    }

    public String getMansione() {
        return mansione;
    }

    public String getReparto() {
        return reparto;
    }

    @Override
    public double calcolaStipendio() {
        return super.calcolaStipendio();
    }

    @Override
    public String toString() {
        return "Operai{" +
                "mansione='" + mansione + '\'' +
                ", reparto='" + reparto + '\'' +
                super.toString()+
                '}';
    }
}
