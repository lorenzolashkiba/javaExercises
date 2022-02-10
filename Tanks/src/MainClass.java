import java.util.Scanner;

public class MainClass
{

    private static Scanner sc;

    private static int inputBoundedInt(int min, int max, String prefix) {
        int scelta;
        do
        {
            System.out.print(prefix);
            scelta = sc.nextInt();
            if(scelta<min || scelta>max)
            {
                System.out.println("Il valore dev'essere compreso tra "+min+" e "+max+", reinseriscilo.\n");
            }
        }
        while(scelta<min || scelta>max);

        return scelta;
    }

    private static int sceltaOperazione() {
        System.out.println("Scegli la prossima operazione da fare : \n1) Ispeziona serbatoio\n2) Riempi serbatoio\n3) Consuma carburante\n0)Annulla");
        return inputBoundedInt(0,3,"Scelta (0-3) : ");
    }

    private static int sceltaSerbatoio() {
        System.out.println("Quale serbatoio desideri usare?\n1) Standard Tank\n2) Irish Tank\n0) Esci");
        return inputBoundedInt(0, 2, "Scelta (0-2) : ");
    }

    private static int sceltaUM() {
        System.out.println("Ma intendi litri o galloni?\n1) Litri\n2) Galloni");
        return inputBoundedInt(1, 2, "Scelta (1-2) : ");
    }

    private static double inputCarburante() {
        System.out.print("Di quanto carburante stiamo parlando ? ");
        double ret = sc.nextDouble();
        while(ret < 0)
        {
            System.out.println("Impossibile, il carburante � sempre positivo. Reinseriscilo : ");
            ret = sc.nextDouble();
        }

        return ret;
    }

    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        Tank t1 = new Tank(40); //TODO creare un serbatoio con capacit� di 40 litri.
        IrishTank t2 = new IrishTank(10); //TODO creare un serbatoio con capacit� di 10 galloni.
        int serbatoio = sceltaSerbatoio();
        while(serbatoio>0)
        {
            int um;
            double carburante;
            boolean isIrish = serbatoio==2;	//questo booleano � a TRUE se si � scelto il serbatoio in galloni
            int operazione = sceltaOperazione();
            switch(operazione)
            {
                case 1:
                    //TODO stampare in output il toString() del serbatoio appropriato
                    Tank polyTank;
                    if(isIrish){
                       polyTank = t2;
                    }else
                    {
                        polyTank = t1;
                    }
                    System.out.println(polyTank);
                    break;
                case 2:
                    carburante = inputCarburante();
                    if(isIrish)
                    {
                        um = sceltaUM();
                        //TODO usare il metodo appropriato del serbatoio in galloni per fare il pieno
                        t2.fillTankGallon(carburante,um);

                    }
                    else
                    {
                        //TODO usare il metodo appropriato del serbatoio in litri per fare il pieno
                        t1.fillTank(carburante);
                    }
                    break;
                case 3:
                    carburante = inputCarburante();
                    if(isIrish)
                    {
                        um = sceltaUM();
                        //TODO usare il metodo appropriato del serbatoio in galloni per estrarre il carburante
                         t2.consumeFuelGallon(carburante,um);
                    }
                    else
                    {
                        //TODO usare il metodo appropriato del serbatoio in litri per estrarre il carburante
                        t1.consumeFuel(carburante);
                    }
                    break;
            }
            serbatoio = sceltaSerbatoio();
        }
        System.out.println("Arrived�rci.");
        sc.close();
    }

}
