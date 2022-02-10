public class Main {

    public static void main(String arg[]){

        Bottiglia b = new Bottiglia(2,2000,20,"red");
        Bottiglia a = new Bottiglia(2,2000,20,"rd");
        System.out.print("prezzo futuro = "+b.calcoloValore(2010));
        System.out.print(" bottiglia 'b' e uguale a bottiglia 'a' = "+b.equals(a));
    }

}
