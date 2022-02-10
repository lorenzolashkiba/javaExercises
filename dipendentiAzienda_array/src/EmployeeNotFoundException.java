public class EmployeeNotFoundException extends Exception{

    public EmployeeNotFoundException(int mate){
        super("nn trovata la matricola = "+mate);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
