public class Personale {

    private int matricola,retribuzioneOraria,numeroTelefono,oreTotali;
    private String nome;
    private String cognome;

    public Personale(String nome, String cognome, int matricola, int retribuzioneOraria,int numeroTelefono){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.retribuzioneOraria = retribuzioneOraria;
        this.numeroTelefono = numeroTelefono;

    }

    public void conteggiaOre(int ore){
       oreTotali += ore;
    }

    public int getMatricola() {
        return matricola;
    }

    public double calcolaStipendio(){

        return oreTotali*retribuzioneOraria;
    }

    @Override
    public String toString() {
        return
                "  matricola=" + matricola +
                ", retribuzioneOraria=" + retribuzioneOraria +
                ", numeroTelefono=" + numeroTelefono +
                ", oreTotali=" + oreTotali +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome ;
    }
}
