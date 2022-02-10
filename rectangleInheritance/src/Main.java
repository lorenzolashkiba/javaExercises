public class Main {


    public static void main(String arg[] ){


            Rectangle rectangle = new Rectangle(5,9);
            Cube cube = new Cube(5);

            System.out.println("Rectangle: \n Area = "+ rectangle.area() +" \n Perimetro = "+ rectangle.perimetro());
            System.out.println("Cube: \n Area = "+ cube.area() +" \n Perimetro = "+ cube.perimetro());

            Rectangle r = cube;

            Cube q2;
        System.out.println("Downcast!");
            if(r instanceof Cube){
                q2 = (Cube) r;
                System.out.println(q2);
            }else{
                q2 = null;
                System.out.println("meh...");
            }
    }
}
