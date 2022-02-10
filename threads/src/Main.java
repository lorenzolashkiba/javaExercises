import control.NuovoThread;
import control.ThreadRunnable;

public class Main { // extends Thread

    public static void main(String args[]){

        System.out.println("Nome Thread main: " + Thread.currentThread());
        Thread threadMain = Thread.currentThread();
        System.out.println(threadMain.getPriority());
        threadMain.setName("Avvio programma");
        System.out.println("Nome Thread main: " + Thread.currentThread());

        System.out.println("vado in pausa");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("mi sono svegliato ");

        System.out.println("nuovo thread");
        //ThreadRunnable t = new ThreadRunnable("prova");
        new Thread(new ThreadRunnable(),"ping").start();



    }
}
