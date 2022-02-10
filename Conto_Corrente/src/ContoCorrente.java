public class ContoCorrente {

    private int numeroConto;
    private String intestatario;
    private int saldo,i=0;
    private int op[]= new int[5];

    public ContoCorrente(int numeroConto,String intestatario,int saldo){
        this.numeroConto=numeroConto;
        this.intestatario = intestatario;
        this.saldo = saldo;
    }
    public int getNumeroConto() {
        return numeroConto;
    }
    public void versamento(int importo){
        op[i]=1; i++; saldo +=importo;
    }
    public void prelievo(int importo){
        op[i] = 2; i++; saldo -=importo;
    }

    public String stampaSaldo(){
         return " Saldo = "+saldo;
    }

    public String stampaVettore(){
        String stringa="";
        for(int j = 0;j<5;j++){

            stringa = stringa + op[j];
            stringa += ", ";
        }
        return stringa;
    }

}
