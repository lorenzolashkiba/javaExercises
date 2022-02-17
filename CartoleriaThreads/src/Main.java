import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Negozio negozio  = new Negozio(30,10);
        Cliente cliente = new Cliente(negozio);
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

    }

}
