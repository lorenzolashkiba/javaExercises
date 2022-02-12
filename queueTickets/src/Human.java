public class Human {
    private String nome;
    private String cognome;
    private int tickets;
    public Human(String nome,String cognome,int tickets){
        this.nome = nome;
        this.cognome = cognome;
        this.tickets = tickets;
    }
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                "tickets ='" + tickets + '\'' +
                '}';
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int compareTo(Human h){

        return Integer.compare(getTickets(),h.getTickets());
    }
}
