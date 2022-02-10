package control;

public class ThreadRunnable implements Runnable{
    // private String nome;
    private Thread t;
    public ThreadRunnable(){
      //  this.nome = nome;
      //  t = new Thread(this,nome);
       // t.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // System.out.println(this.nome);
        }
    }
}
