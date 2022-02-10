public class Cliente {

    private String nome;
    private String cognome;

    public Cliente(String nome,String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }   @Override

}
