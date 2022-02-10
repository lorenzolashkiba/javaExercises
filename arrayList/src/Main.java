import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        ArrayList<String> stringArray = new ArrayList<String>();
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        arrayInt.add(2);
        System.out.println(arrayInt);
        stringArray.add("11");
        stringArray.add("22");
        stringArray.add("33");
        System.out.println(stringArray);
        stringArray.remove("22");
        System.out.println(stringArray);
        System.out.println(stringArray.get(1));


    }
}
