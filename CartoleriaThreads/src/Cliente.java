public class Cliente extends Thread{
    Negozio negozio;
    public Cliente(Negozio negozio){
        this.negozio = negozio;
        this.start();
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep( 1000);
                negozio.takeMatita(10);
                negozio.takeQuaderno(5);
                System.out.println(negozio);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
