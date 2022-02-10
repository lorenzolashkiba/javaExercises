public class Main {
    public static void main(String[] args) {

         CodaPostale codaPostale = new CodaPostale(5);


        for (int i = 0; i < 5; i++) {
            codaPostale.queue(new Cliente("gigi"+i,"hfhf"));
        }
        System.out.println(codaPostale);
        System.out.println("start "+codaPostale.getStart());
        System.out.println("tail "+codaPostale.getCuu());
        System.out.println(codaPostale.deQueue());
        codaPostale.queue(new Cliente("gigi","hfhf"));
        System.out.println(codaPostale);
        System.out.println(codaPostale.deQueue());

        for (int i = 0; i < 5; i++) {
            System.out.println(codaPostale.deQueue());
        }
        System.out.println(codaPostale);
      /*  for (int i = 0; i < 10; i++) {
            codaPostale.deQueue();
        }*/

    }
}
