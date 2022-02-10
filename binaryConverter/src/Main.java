public class Main {
    public static void main(String[] args) {
        List<Integer> binary = new List<Integer>();
        List<String> hex = new List<String>();

        int a = 43;

        while(a>0){
            binary.push(a%2==0?0:1);
            a=a/2;
        }
        System.out.println(binary);

        a = 256;
        int resto = a%16;
        int index=0,b=16;
        while(b<=a){
            index++;
            b+=16;
        }
        hex.push(String.valueOf(index));
        hex.push(resto>=10?Character.toString((char) resto+55):String.valueOf(resto));
        System.out.println(hex);


    }
}
