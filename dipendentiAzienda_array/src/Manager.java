public class Manager extends Personale {

    String progetto;
    public Manager(String nome, String cognome, int matricola, int retribuzioneOraria,int numeroTelefono,String progetto){
        super( nome,cognome, matricola, retribuzioneOraria,numeroTelefono);
        this.progetto = progetto;
    }

    @Override
    public double calcolaStipendio() {
        return super.calcolaStipendio()+1000;
    }

    public String getProgetto() {
        return progetto;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "progetto='" + progetto + '\'' +
                super.toString()+
                '}';
    }
}
