import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Data data = new Data(11,8,2020);
        Data data1 = new Data(1,1,2000);
        Data data2 = new Data();

       System.out.println( data.toString());
       if(data.tipoAnno(data.getAnno())){
           System.out.println(" è bisestile");
       }else System.out.println("nn è bisestile");
        System.out.println("distanza da 1/1, " + data.distanzaDa(1,1) +" giorni");
        System.out.println("distanza da 31/12, " + data.distanzaDa(31,12)+" giorni");
        System.out.println("distanza da data , "+ data.distanzaDaData(data1) +" giorni");

    }
}
