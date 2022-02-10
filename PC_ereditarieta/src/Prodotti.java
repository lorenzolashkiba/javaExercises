public class Prodotti {

    private int processore, memoria, hardisk;
    private boolean rom;
    private double codiceProdotto, prezzo;

    public Prodotti(int processore, int memoria, int hardisk, boolean rom, double codiceProdotto, double prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.processore = processore;
        this.hardisk = hardisk;
        this.memoria = memoria;
        this.prezzo = prezzo;
        this.rom = rom;
    }

    public double getCodiceProdotto() {
        return codiceProdotto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getHardisk() {
        return hardisk;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getProcessore() {
        return processore;
    }

    public boolean isRom() {
        return rom;
    }

    @Override
    public String toString() {

               return  "processore=" + processore +
                ", memoria=" + memoria +
                ", hardisk=" + hardisk +
                ", rom=" + rom +
                ", codiceProdotto=" + codiceProdotto +
                ", prezzo=" + prezzo +
                '}';
    }
}
