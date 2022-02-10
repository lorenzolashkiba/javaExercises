
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Mansola mensola = new Mansola();
        String[] autori= {"Zerilli", "Ventilii"};

        Libro a = new Libro(111455431, autori, "italiano");

        Libro b = new Libro(141545131, autori, "storia");

        System.out.println("Uguali?: "+a.equals(b));
        System.out.println(a.toString());


        Libro c = new Libro(34556, "info");
        c.setAutore(autori);
        c.setAnnoPubblicazioni(2018);
        c.setAnnoPubblicazioni(2019);

        System.out.println(c);



        mensola.aggiungiLibro(a);
        mensola.aggiungiLibro(b);
        mensola.aggiungiLibro(c);


        System.out.println(" mensola = "+mensola.toString());
        System.out.println(" libro trovato = "+ mensola.cercaLibro(c));
        mensola.eliminaLibro(b);
        System.out.println(" mensola = "+mensola.toString());
    }

}