public class Fornitore implements Runnable {

    Negozio negozio;
     public Fornitore(Negozio negozio){
         this.negozio = negozio;
     }

    @Override
    public synchronized void run() {

        while (true) {
            try {
                Thread.sleep(4000);
                negozio.rifornisci(100,50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
