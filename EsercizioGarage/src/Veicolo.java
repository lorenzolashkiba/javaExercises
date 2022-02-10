 public abstract class Veicolo {

    protected int annoImmatri;
    protected String marca;
    protected String modello;
    protected String tipoAlimentazione;
    protected int cilindrata;

    protected Veicolo(int annoImmatri,String marca,String modello,String tipoAlimentazione,int cilindrata){
        this.annoImmatri = annoImmatri;
        this.marca = marca;
        this.modello = modello;
        this.tipoAlimentazione = tipoAlimentazione;
        this.cilindrata = cilindrata;
    }


}
