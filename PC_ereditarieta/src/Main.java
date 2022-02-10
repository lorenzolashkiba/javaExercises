import java.util.Scanner;

public class Main {

    public static Scanner sc;
    public static Prodotti inserisciArticolo() {
        System.out.print(" e un pc ? si = 1 no = 0: ");
        int sceltaa = sc.nextInt();
        sc.nextLine();
        if (sceltaa == 1) {
            System.out.print("inserisci il prezzo: ");
            int prezzo = sc.nextInt();
            System.out.print("inserisci il codice: ");
            int codice = sc.nextInt();
            return new Pc(23, 56, 23, true, codice, prezzo);
        } else {
            System.out.print("inserisci il prezzo: ");
            int prezzo = sc.nextInt();
            System.out.print("inserisci il peso: ");
            int peso = sc.nextInt();
            System.out.print("inserisci la grad schermo: ");
            int schermo = sc.nextInt();
            System.out.print("inserisci il codice: ");
            int codice = sc.nextInt();
            return new Notebook(23, 56, 23, true, codice, prezzo, peso, schermo);

        }
    }
    public static void main(String[] args){

        sc = new Scanner(System.in);
        int scelta;
        Negozio negozio = new Negozio();
        do {
            System.out.println("---Menu---");
            System.out.println("1.Inserire nuovo articolo");
            System.out.println("2.Cancellazione articolo (con codice)");
            System.out.println("3.Stampa articoli");
            System.out.println("4.Stampa solo pc");
            System.out.println("5.elimina solo pc");
            System.out.println("0.Exit");
            System.out.print("inserisci un numero :");
             scelta = sc.nextInt();
            switch (scelta) {
                case 1:
                    negozio.addProdotto(inserisciArticolo());
                    break;
                case 2:
                    try {
                        System.out.print("inserisci il codice da eliminare :");
                        int codice = sc.nextInt();
                        negozio.eliminaProdotto(codice);
                    }catch (ProductNotFoundException p){
                        System.out.println(p);
                        p.getMessage();
                    }
                    break;
                case 3:
                    System.out.println("STAMPA PRODOTTI \n" + negozio.toString());
                    break;
                case 4:
                    System.out.println("STAMPA PC \n" + negozio.stampaPc());
                    break;
                case 5:
                    try {
                        System.out.print("inserisci il codice da eliminare :");
                        int codice = sc.nextInt();
                        negozio.eliminaPc(codice);
                    }catch (ProductNotFoundException p){
                        System.out.println(p);
                    }
                    break;

            }
        }while(scelta!=0);
    }
}
