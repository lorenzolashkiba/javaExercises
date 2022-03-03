import java.util.concurrent.Semaphore;

public class Cliente extends Thread {

    private ContoCorrente c;
    private int time;
    private Semaphore deposi ;
    double amount;
    String n;
    public Cliente(ContoCorrente c,int t,double f,String n) {
        this.c = c;
        this.time = t;
        this.amount = f;
        this.n =n;
        deposi =  new Semaphore(1);
        this.start();

    }

    @Override
    public void run() {

        while (true) {
            try {
                deposi.acquire();
                c.deposito(amount);
                deposi.release();
                Thread.sleep(1000);

                deposi.acquire();
                c.prelievo(60);
                deposi.release();

                System.out.println(n+" "+c.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
