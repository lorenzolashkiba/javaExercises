import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static void menu(){
        System.out.println("1. inserire un nuovo dipendente");
        System.out.println("2. cancellare un dipendente");
        System.out.println("3. stampare tutti i manager di un progetto");
        System.out.println("4. stampare operai con mansione saldatore del reparto officina");
        System.out.println("5. metti le ore del lavoratore");
        System.out.println("6. calcola stipendio");
        System.out.println(" \n -- inserire scelta : ");
    }

    public static Personale inserireDipendente(){
        System.out.print(" e un operaio ? si = 1 no = 0: ");
        int scelta = sc.nextInt();
        sc.nextLine();
        if(scelta == 1){
            System.out.print("inserisci nome: ");
            String nome = sc.nextLine();
            System.out.print("inserisci congnome: ");
            String cognome = sc.nextLine();
            System.out.print("inserisci matricola: ");
            int matricola = sc.nextInt();
            sc.nextLine();
            System.out.print("inserisci la mansione: ");
            String mansione = sc.nextLine();
            int retribuzioneOraria = 5;
            int numeroTelefono = 32489789;

            String reparto = "officina";
            return new Operai(nome,cognome,matricola,retribuzioneOraria,numeroTelefono,mansione,reparto);
        }else{
            System.out.print("inserisci nome: ");
            String nome = sc.nextLine();
            System.out.print("inserisci congnome: ");
            String cognome = sc.nextLine();
            System.out.print("inserisci matricola: ");
            int matricola = sc.nextInt();
            sc.nextLine();
            int retribuzioneOraria = 5;
            int numeroTelefono = 32489789;
            System.out.print("inserisci il progetto: ");
            String progetto = sc.nextLine();
            return new Manager(nome,cognome,matricola,retribuzioneOraria,numeroTelefono,progetto);
        }


    }
    public static void main(String[] args){
         sc = new Scanner(System.in);
         int scelta;
        Azienda azienda = new Azienda();
        do {
            menu();
             scelta = sc.nextInt();
            switch (scelta) {
                case 1:
                    azienda.creaDipendente(inserireDipendente());
                    break;
                case 2:
                    System.out.print("inserisci la matricola da eliminare: ");
                    int m = sc.nextInt();
                    try {
                        azienda.cancDipendente(m);
                    }catch (EmployeeNotFoundException e) {
                        System.out.println(e.toString());
                    }

                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("inserisci il progetto dei manager da stampare: ");
                    String p = sc.nextLine();
                    System.out.println("\n STAMPA TUTTI I MANAGER :\n " + azienda.stampaManager(p));
                    break;
                case 4:
                    System.out.println("\n STAMPA OPERAI SALDATORI :\n " + azienda.stampaOperai());
                    break;
                case 5:
                    System.out.println("inserisci la matricola: ");
                    int mat = sc.nextInt();
                    try {
                        azienda.aumentaOre(mat,4);
                    }catch (EmployeeNotFoundException e) {
                        System.out.println(e.toString());
                    }

                    break;
                case 6:
                    System.out.println("inserisci la matricola: ");
                    int mat1 = sc.nextInt();
                    try {
                        System.out.println(" stipendio :"+azienda.calcolaStipendio(mat1));
                    }catch (EmployeeNotFoundException e) {
                        System.out.println(e.toString());
                    }

                    break;
                case 7:
                    System.out.println("\n STAMPA TUTTI :\n " + azienda.stampaTutti());
                    break;

            }
        }while(scelta!=0);

    }
}
