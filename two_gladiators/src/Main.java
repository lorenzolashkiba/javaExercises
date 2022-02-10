import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Gladiatore nuovoGladiatore(){
        int vita = 103,dannoArma = 15,tipoArma = 1,riduzioneDanno = 9,tipoArmatura = 1;

        System.out.print(" \n inserisci i punti ferita :");
        vita = sc.nextInt();
        System.out.print(" \n inserisci danno arma :");
        dannoArma = sc.nextInt();
        System.out.print(" \n inserisci tipo arma :");
        tipoArma = sc.nextInt();
        System.out.print(" \n inserisci riduzione Danno armatura :");
        riduzioneDanno = sc.nextInt();
        System.out.print(" \n inserisci tipo armatura :");
        tipoArmatura = sc.nextInt();

        return new Gladiatore(vita,dannoArma,tipoArma,riduzioneDanno,riduzioneDanno+4,tipoArmatura);
    }
    public static void main(String[] args){

        Gladiatore gladiatore1 = nuovoGladiatore();
        Gladiatore gladiatore2 = nuovoGladiatore();

        while(!gladiatore2.arreso() && !gladiatore1.isArresoo())
        {
            gladiatore2.subisci(gladiatore1.colpisci(), gladiatore1.getArma().getTipoDanno());

            if (!gladiatore2.arreso()) {
                gladiatore1.subisci(gladiatore2.colpisci(), gladiatore2.getArma().getTipoDanno());
            }
        }

        if(gladiatore1.getPuntiFerita() < gladiatore2.getPuntiFerita()||gladiatore1.arreso())
        {
            System.out.println(" ha vinto il gladiatore 2 "+ gladiatore2.getPuntiFerita()+" punti ferita"+" arreso = "+gladiatore2.arreso());
            System.out.println(" gladiatore 1 arreso = " + gladiatore1.isArresoo());

        }else  if(gladiatore2.getPuntiFerita() < gladiatore1.getPuntiFerita()||gladiatore2.arreso())
        {
            System.out.println(" ha vinto il gladiatore 1 "+ gladiatore1.getPuntiFerita()+" punti ferita"+" arreso = "+gladiatore1.arreso());
            System.out.println(" gladiatore 2 arreso = " + gladiatore2.isArresoo());
        }

        sc.close();
    }

}
