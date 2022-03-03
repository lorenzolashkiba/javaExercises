import java.util.concurrent.Semaphore;

public class ContoCorrente{
    private String intestatario;
    private double saldo;


    public ContoCorrente(String intestatario) {
        this.intestatario = intestatario;
        this.saldo = 1000;
    }


    public void deposito(double deposito){
        saldo += deposito;
    }
    public void prelievo(double prelievo){
        if(saldo - prelievo>=0)
            saldo -= prelievo;
        else saldo=0;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "intestatario='" + intestatario + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }
}
