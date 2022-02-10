public class Main {

    public static void main(String args[]) {

        Punto puntoA = new Punto(0,0);
        Punto puntoB = new Punto(0,2);
        Punto puntoC = new Punto(2,0);

        Triangolo triangolo= new Triangolo(puntoA,puntoB,puntoC);
        System.out.print("perimetro = "+triangolo.perimetro());
        System.out.print("area = "+triangolo.area());

    }
}
