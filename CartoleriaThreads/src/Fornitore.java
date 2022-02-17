public class Fornitore implements Runnable {

    Negozio negozio;
     public Fornitore(Negozio negozio){
         this.negozio = negozio;
     }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(4000);
                negozio.setMatite(negozio.getMatite()+100);
                negozio.setQuaderni(negozio.getQuaderni()+50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
