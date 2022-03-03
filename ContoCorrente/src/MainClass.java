import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x;
        ContoCorrente c = new ContoCorrente("lsls");
        Cliente c1 =new Cliente(c,1000,70, "1");
        Cliente c2 =new Cliente(c,1000,30,"2" );

    }
}
