
public class Triangolo {

        private Punto puntoA;
        private Punto puntoB;
        private Punto puntoC;

        public Triangolo(Punto a,Punto b,Punto c) {
                puntoA = a;
                puntoB = b;
                puntoC = c;
        }

        public double perimetro(){
                double distanzaAB = puntoA.distanzaPunti(puntoB);
                double distanzaBC = puntoB.distanzaPunti(puntoC);
                double distanzaCA = puntoC.distanzaPunti(puntoA);

                return distanzaAB+distanzaCA+distanzaBC;
        }

        public double area(){
                double distanzaAB = puntoA.distanzaPunti(puntoB);
                double distanzaBC = puntoB.distanzaPunti(puntoC);
                double distanzaCA = puntoC.distanzaPunti(puntoA);
                double p = perimetro()/2;
                System.out.print("area classe = "+java.lang.Math.sqrt(p*(p-distanzaAB)*(p-distanzaBC)*(p-distanzaCA)));
                return java.lang.Math.sqrt(p*(p-distanzaAB)*(p-distanzaBC)*(p-distanzaCA));

        }
}
