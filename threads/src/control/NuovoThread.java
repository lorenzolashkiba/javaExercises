package control;

public class NuovoThread extends Thread{

    private String nome ;
     public NuovoThread(String nome){
         this.nome = nome;

     }

     public void run(){
         // TUTTE LE ISTRUZIONI DEL THREAD
         while (true) {
             try {
                 Thread.sleep(3000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(this.nome);
         }
     }
}
