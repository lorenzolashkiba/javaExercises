public class Furgone extends Veicolo {
    private float capacitàCarico;
    public Furgone(int annoImmatri,String marca,String modello,String tipoAlimentazione,int cilindrata,float capacitaCarico){
        super(annoImmatri, marca, modello, tipoAlimentazione, cilindrata);
        this.capacitàCarico = capacitaCarico;
    }

    public float getCapacitàCarico() {
        return capacitàCarico;
    }
}
