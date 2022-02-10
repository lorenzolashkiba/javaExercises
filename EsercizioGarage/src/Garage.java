import java.util.ArrayList;

public class Garage {

    ArrayList<Veicolo> veicoliGarage;

    public Garage(){
        veicoliGarage = new ArrayList<Veicolo>();

    }

    public void ingressoVeicolo(Veicolo veicolo){
        veicoliGarage.add(veicolo);
    }
    public ArrayList<Veicolo> getVeicoliGarage() {
        return veicoliGarage;
    }
}