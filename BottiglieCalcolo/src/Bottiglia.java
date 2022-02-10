public class Bottiglia {

        //variabili bottiglia
        private static Bottiglia Tessoro;
        private String color;
        private int anno;
        private double grado;
        private double prezzoProduzione;
        private double prezzoVendita;

        public Bottiglia( double _prezzoProduzione, int _anno, double _grado, String _color) {
            prezzoProduzione = _prezzoProduzione;
            anno = _anno;
            grado = _grado;
            color = _color;
        }

        public double calcoloValore(int currentYear) {
            int  H =  currentYear - anno;
            double valore = prezzoProduzione;
            for(int i=0;i<H;i++) {
                valore = valore + (valore*10)/100;
            }
            return valore;
        }

        public boolean equals(Bottiglia x) {
            return this.anno == x.anno &&
                    this.prezzoProduzione == x.prezzoProduzione &&
                    this.grado == x.grado &&
                    this.color.equals(x.color);

        }
        public String getColor() {
            return color;
        }

        public int getAnno() {
            return anno;
        }

        public double getGrado() {
            return grado;
        }

        public void setGrado(int _grado) {
            grado = _grado;
        }

        public double getPrezzoProduzione() {
            return prezzoProduzione;
        }

        public double getPrezzoVendita() {
            return prezzoVendita;
        }

        public void setPrezzoVendita(double _prezzoVendita) {
            prezzoVendita = _prezzoVendita;
        }




}

