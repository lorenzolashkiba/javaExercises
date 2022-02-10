public class Main {

    public static void main(String[] arg){

        Queue e = new Queue(5);
        for (int i = 0; i < e.human.length; i++) {
            e.queue(new Human("nome"+i,"cognom"+i,1+i));
        }
        System.out.println(e);
        e.yourTurn();
        System.out.println(e);
    }
}
