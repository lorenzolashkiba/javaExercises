import java.util.Scanner;

public class Main {

    public static void main(String arg[]){
        int scelta;
        Scanner sc = new Scanner(System.in);
        System.out.println("CONTO CORRENTE");
        System.out.println("inserisci il nome dell'intestatario = ");
        String nome = sc.nextLine();
        System.out.println("inserisci il numero conto = ");
        int nConto = sc.nextInt();
        System.out.println("inserisci il saldo = ");
        int saldo = sc.nextInt();
        ContoCorrente c = new ContoCorrente(nConto,nome,saldo);
        do {
            System.out.println("1. Versamento ");
            System.out.println("2. Prelievo ");
            System.out.println("3. Lista movimenti ");
            System.out.println("4. Saldo ");
            System.out.println("5. Exit ");

            System.out.println("inserisci la tua scelta  = ");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1: {
                    System.out.println("inserisci l'importo da versare = ");
                    int importo = sc.nextInt();
                    c.versamento(importo);

                    break;
                }
                case 2: {
                    System.out.println("inserisci l'importo da prelevare = ");
                    int importo = sc.nextInt();
                    c.prelievo(importo);
                }
                case 3: System.out.println("ultimi 5 movimenti  = "+ c.stampaVettore());
                    break;

                case 4: System.out.println(c.stampaSaldo());
                    break;


            }
        }while(scelta!=5);
    }



}
