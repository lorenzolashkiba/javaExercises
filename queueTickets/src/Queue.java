import java.util.Arrays;

public class Queue implements IQueue<Human> {

    Human human[];
    private int start=0;
    private int curr=0;

    public Queue(int size){
        human = new Human[size];
    }
    @Override
    public Human deQueue() {
        if(isEmpty()) {
            throw new IllegalStateException("la coda è vuota");
        }
        Human d = human[start];
        human[start] = null;
        start++;
        return d;
    }

    @Override
    public void queue(Human a) {
        if(isFull()){
            throw new IllegalStateException("la coda è piena");
        }

        human[curr]=a;
        curr++;
    }
    public boolean isEmpty(){
        return curr<1;
    }
    public boolean isFull(){
        return curr==human.length;
    }
    @Override
    public Human peek() {
        return human[start];
    }
    @Override
    public String toString() {
        return "Coda{" +
                "coda=" + Arrays.toString(human) +
                '}';
    }
    public void yourTurn(){

        for (Human h : human) {
          h.setTickets(h.getTickets()-1);

        }
        for (int i = 0; i< human.length; i++) {
            if(human[i].getTickets()<1){
                human[i] = null;
            }
        }
    }


}
