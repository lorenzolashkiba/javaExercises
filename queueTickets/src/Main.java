public class Main {

    public static void main(String[] arg){

        Queue e = new Queue(5);

        e.queue(new Human("nome1","cognom1",1));
        System.out.println(e);
        e.queue(new Human("nome2","cognom2",2));
        e.queue(new Human("nome2","cognom2",3));
        e.queue(new Human("nome2","cognom2",2));
        e.queue(new Human("nome2","cognom2",4));
        System.out.println(e);


    }
}
