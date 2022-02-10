public class Arma {

       private int danno;
       private int tipoDanno;

        public Arma(int danno, int tipoDanno){
                this.danno = danno;
                this.tipoDanno = tipoDanno;
        }

        public int getDanno() {
                return danno;
        }

        public int getTipoDanno() {
                return tipoDanno;
        }

        public String toStringArma(){

                return "\n danno = " + danno + " \n tipo arma = " + tipoDanno;
        }
}
