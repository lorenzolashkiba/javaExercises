public class Azienda {


    private static int numeroDipendenti=100;
    private Personale[] personale;
    private int currDipendenti;
    public Azienda(){
         personale = new Personale[numeroDipendenti];
        currDipendenti = 0;
    }

    public void creaDipendente(Personale p){
    personale[currDipendenti] = p;
    currDipendenti++;
    }

    public String stampaManager(String project){
        String string = new String();
        for(int i = 0;i< currDipendenti;i++){
            if(personale[i] instanceof Manager) {
                    Manager m = (Manager) personale[i];
                    if(m.getProgetto().equals(project)) {
                        string += personale[i].toString();
                    }
            }
            string += "\n";
        }
        return string;
    }
    public String stampaTutti(){
        String string = new String();
        for(int i = 0;i< currDipendenti;i++){

            string += personale[i].toString();

            string += "\n";
        }
        return string;
    }
    public void aumentaOre(int matricola,int ore) throws EmployeeNotFoundException{
        int i = trovaDipendente(matricola);
        if(i>-1){
            personale[i].conteggiaOre(ore);

        }
    }
    public double calcolaStipendio(int matricola) throws EmployeeNotFoundException{
        int i = trovaDipendente(matricola);
        if(i>-1){
            return personale[i].calcolaStipendio();

        }
        return -1;
    }
    public void cancDipendente(int Matricola) throws EmployeeNotFoundException{

        personale[trovaDipendente(Matricola)] = personale[currDipendenti-1];
        personale[currDipendenti-1] = null;
        currDipendenti--;
    }
    public String stampaOperai(){
    String s = new String();
        for (int i = 0; i <currDipendenti; i++) {
            if(personale[i] instanceof Operai){
                Operai o = (Operai) personale[i];

                if(o.getMansione().equals("saldatore")&&o.getReparto().equals("officina")){
                    s += o.toString();
                }
            }
            s+= "\n";
        }
        return s;
    }

    public int trovaDipendente(int matricola) throws EmployeeNotFoundException{
    int i;
        for( i = 0;i< currDipendenti;i++){
            if(personale[i].getMatricola()==matricola){
                return i;
            }
        }
        i = -1;
        if(i==-1) {
            throw new EmployeeNotFoundException(matricola);
        }
        return i;

    }
}
