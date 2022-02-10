import java.util.Scanner;

public class Main {

    public static Scanner sc;

    private static Dado dadoTruccato(int nFacce,int n){
        int vuoiBarare;
        System.out.println("vuoi barare dado " +n+" ? inserisci 1 se no inserisci 0 :" );
        vuoiBarare = sc.nextInt();
        Dado dadoTruccato;

        if(vuoiBarare==1){
            dadoTruccato = new DadoTruccato(nFacce);
            return dadoTruccato;
        }
        else
        {
            return new Dado(nFacce);
        }
    }
    public static void main(String args[]){

        sc = new Scanner(System.in);
        System.out.print("inserisci il numero di faccie = ");
         int nFacce = sc.nextInt();
        Dado dado1 = new Dado(nFacce);
        Dado dado2 = new Dado(nFacce);

        System.out.println("vuoi la giocare? inserisci 1 :" );
        int rivincita = sc.nextInt();

        while(rivincita!=0) {

            System.out.println(" -----START-----\n Tiro del primo dado, uscito numero : " + dado1.randomFaccia());
            System.out.println("  Tiro del secondo dado, uscito numero : " + dado2.randomFaccia());

            System.out.println("-----VINCITORE-----");
            if (dado1.getRandNumero() > dado2.getRandNumero()) {
                System.out.println("ha vinto il dado numero 1");
            } else System.out.println("ha vinto il dado numero 2");

            System.out.println("vuoi la rivincità ? inserisci 1 se no inserisci 0 :" );
            rivincita = sc.nextInt();

            dado1 = dadoTruccato(nFacce,1);

            dado2 = dadoTruccato(nFacce,2);

        }
    }
}
