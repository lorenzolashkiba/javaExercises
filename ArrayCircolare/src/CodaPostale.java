import java.util.ArrayList;
import java.util.Arrays;

public class CodaPostale {

    private Cliente[] coda;
    private int currSize = -1;
    private int start=-1;
    private boolean isQueue = true;
    public CodaPostale(int size){
        this.coda = new Cliente[size];
    }
    public void queue(Cliente c){
        if(isFull()) {
                throw new IllegalStateException("la coda e piena");
        }
        if (isEmpty()) {
            start=0;
        }
        isQueue = true;
        currSize = (currSize+1)%coda.length;
        coda[currSize] = c;
    }
    public Cliente deQueue(){
        if(isEmpty()) {
            throw new IllegalStateException("la coda è vuota");
        }
        isQueue = false;
        Cliente c = coda[start];
        coda[start] = null;
       start = (start+1)%coda.length;
        return c;
    }

    public boolean isEmpty(){
      return !isQueue && currSize == start;
    }
    public boolean isFull(){
        return isQueue && currSize == start;
    }

    public int getStart() {
        return start;
    }
    public int getCuu() {
        return currSize;
    }

    @Override
    public String toString() {
        return "CodaPostale{" +
                "coda=" + Arrays.toString(coda) +
                '}';
    }
}


