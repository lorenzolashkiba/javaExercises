import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] array = {4,2,3,4,1,4,2,4,10,222,12,12,239023,234342349,234,2349,2342349,23,923,123,5,5,6};
            /*
                2,4,3,4,1,4,2,4,5,5,6
                2,3,4,4,1,4,2,4,5,5,6
                2,3,4,1,4,4,2,4,5,5,6

             */
        for (int i = 1; i < array.length; i++) {
            int j = i-1;
            while(j>=0&&array[j+1]<array[j]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
