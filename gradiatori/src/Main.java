import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    // input boolean variable
    public static boolean inputBoundedBoolean(String message){
        boolean error = true;
        boolean x=false;
        do {
            try {
                System.out.print(message);
                x =sc.nextBoolean();
                error = false;
            }
            catch (Exception e){
                System.out.println("error input mismatch");
                sc.next();
            }
        }while(error);

        return x;

    }
    //input int variable
    public static int inputBoundedInt(String message, int min, int max)
    {
        boolean error = true;
        int x = 0;
        do {
            try {
                System.out.print(message);
                x =sc.nextInt();
                while (x < min || x > max) {
                    System.out.println("Errore, il valore deve essere compreso tra " + min + " e " + max + "\n" + message);
                    x = sc.nextInt();

                }
                error = false;
            }
            catch (Exception e){
                System.out.println("error input mismatch");
                sc.next();
            }
        }while(error);

        return x;
    }
    //input armatura
    public static Armatura scegliArmatura(){
        System.out.println("===Scegli il tipo di Armatura===");
        String string="\n";

        for(Armatura a : Armatura.values()){

            string += a.toString()+'\n';
        }
        string += "\n ==insersci il numero :";
        int tipo = inputBoundedInt(string,1,3);
        for(Armatura a : Armatura.values()){

            if(a.getIdentificativo()==tipo){
                return a;
            }
        }
    return null;
    }
    // input arma
    public static Arma scegliArma(){
        System.out.println("===Scegli il tipo di Arma===");
        String string="\n";

        for(Arma a : Arma.values()){

            string += a.toString()+'\n';
        }
        string += "\n ==insersci il numero :";
        int tipo = inputBoundedInt(string,1,3);
        for(Arma a : Arma.values()){

            if(a.getIdentificativo()==tipo){
                return a;
            }
        }
        return null;
    }
    // input tutto il gladiatore
    public static Gladiator gladiatore()
    {
        System.out.println("===Scegli il tipo di Gladiatore ===");
        String message = "===Gladiatori:\n 1.SAMURAI \n 2.DUELLANTE \n 3.BERSERK \n ===inserisci il tipo:";
         int tipo = inputBoundedInt(message,1,3);
        Armatura armatura = scegliArmatura();
        while(armatura==null){
            System.out.println("ERROR!");
            armatura = scegliArmatura();
        }
        boolean ARMleggera = inputBoundedBoolean("\n===Armatura leggera? true o false :");

        Arma arma  = scegliArma();
        while(arma==null){
            System.out.println("ERROR!");
            arma = scegliArma();
        }
        boolean ARMAmastodontica = inputBoundedBoolean("\n===Arma mastodontica? true o false :");

        switch (tipo) {
            case 1: {
                return new Samurai(130,armatura,arma,ARMleggera);
            }
            case 2: {
                return new Duellante(100,armatura,arma,ARMleggera);

            }
            case 3: {
                return new Berserk(150,armatura,arma,ARMleggera);
            }
        }
    return null;
    }

  ì
        sc = new Scanner(System.in);
        System.out.println("--START--");
        System.out.println("\n======GLADIATORE 1======");
        Gladiator gladiatore1 = gladiatore();
        while (gladiatore1==null){
            System.out.println("ERROR!");
            gladiatore1 = gladiatore();
        }
        System.out.println("\n======GLADIATORE 2======");
        Gladiator gladiatore2 = gladiatore();
        while (gladiatore2==null){
            System.out.println("ERROR!");
            gladiatore2 = gladiatore();
        }
        // sorteggio casuale per chi colpirà per primo nn funziona bene
      /*+ if(Math.random()<=0.5){
            Gladiator temp = gladiatore2;
            gladiatore2 = gladiatore1;
            gladiatore1 = gladiatore2;
            System.out.println("cambio");
        }*/

        //  scontro tra gladiatori
        System.out.println("\n=======START MATCH======\n il "+gladiatore1+" sferrerà il primo colpo");
        while(gladiatore1.getCurrHealth()>0&&gladiatore2.getCurrHealth()>0&&gladiatore1.isSurrended()!=0&&gladiatore2.isSurrended()!=0){
        System.out.println("    "+gladiatore2+" take damage"+gladiatore1.hit(gladiatore1.arma.getDanno()));
        gladiatore2.damage(gladiatore1.hit(gladiatore1.arma.getDanno()),gladiatore1.arma.getTipoDanno());

        System.out.println("    "+gladiatore1+" take damage"+gladiatore2.hit(gladiatore2.arma.getDanno()));
        gladiatore1.damage(gladiatore2.hit(gladiatore2.arma.getDanno()),gladiatore2.arma.getTipoDanno());

         }

        //stampa vincitore
        System.out.println(" =====POSITIONS=====");
        if(gladiatore1.getSurrended()>-1){
            System.out.println(gladiatore1+" SURRENDED WITH "+gladiatore1.getCurrHealth()+"HP");
            System.out.println("WINS "+gladiatore2+" WITH "+gladiatore2.getCurrHealth()+"HP");
        }else if(gladiatore2.getSurrended()>-1){
            System.out.println(gladiatore2+" SURRENDED WITH "+gladiatore2.getCurrHealth()+"HP");
            System.out.println("WINS "+gladiatore1+" WITH "+gladiatore1.getCurrHealth()+"HP");
        }else if(gladiatore1.getCurrHealth()> gladiatore2.getCurrHealth()){
            System.out.println("WINS "+gladiatore1+" WITH "+gladiatore1.getCurrHealth()+"HP");
        }else {
            System.out.println("WINS "+gladiatore2+" WITH "+gladiatore2.getCurrHealth()+"HP");
        }
    }
}
