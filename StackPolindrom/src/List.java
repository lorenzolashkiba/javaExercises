import java.util.ArrayList;

public class List<T> implements Ipila<T> {

    private ArrayList<T> list= new ArrayList<T>(); ;

    @Override
    public void push(T t) {
        list.add(t);
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }
        return str;
    }

    @Override
    public T pop() {

       T r =  peek();
        list.remove(list.size()-1);
        return r;
    }
    public int getSize(){
        return list.size();
    }

    public Boolean isEmplty() {
        return list.isEmpty();
    }
    @Override
    public T peek() {
      return  list.isEmpty() ? null : list.get(list.size()-1);
    }

}
