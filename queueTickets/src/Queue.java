import java.util.Arrays;

public class Queue implements IQueue<Human> {

    Human[] human;
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
    public boolean sort(Human a)
    {
        boolean changed = false;
        if(curr>0){
            human[curr] = a;
            int i = curr-1;
                while(i>=0&&human[i].compareTo(human[i+1])<0){
                    Human h = human[i];
                    human[i]= human[i+1];
                    human[i+1]=h;
                    changed = true;
                    i--;
                }
        }
        return changed;
    }
    @Override
    public void queue(Human a) {
        if(isFull()){
            if(start > 0){
                for(int i=start;i<curr;i++){
                    human[i-start] = human[i];
                    human[i] = null;
                }
                curr -= start;
                start = 0;

            }else{
                throw new IllegalStateException("la coda è piena");
            }

        }
       if(!sort(a)){
           human[curr++] = a;
       }else curr++;


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
            if(h!=null) {
                h.setTickets(h.getTickets() - 1);
            }

        }
        for (int i = 0; i< human.length; i++) {
            if(human[i]!=null&&human[i].getTickets()<1){
                human[i] = null;
            }
        }
    }


}
