public class Motociclietta extends Veicolo{

    private int tempiMotori;
    public Motociclietta(int annoImmatri,String marca,String modello,String tipoAlimentazione,int cilindrata,float capacitaCarico){
        super(annoImmatri, marca, modello, tipoAlimentazione, cilindrata);
        this.tempiMotori = tempiMotori;
    }
}
