public class Armatura {
       private  int riduzioneDanno;
       private  int riduzioneTipoDanno;
        private int tipoArmatura;

        public Armatura(int riduzioneDanno, int riduzioneTipoDanno, int tipoArmatura){
                this.riduzioneDanno = riduzioneDanno;
                this.riduzioneTipoDanno = riduzioneTipoDanno;
                this.tipoArmatura = tipoArmatura;
        }

        public int getRiduzioneDanno() {
                return riduzioneDanno;
        }

        public int getRiduzioneTipoDanno() {
                return riduzioneTipoDanno;
        }

        public int getTipoArmatura() {
                return tipoArmatura;
        }

        public String toStringArmatura(){

                return "\n riduzione danno = " + riduzioneDanno + " \n tipo armatura = " + tipoArmatura + " \n riduzione Bonus = "+ riduzioneTipoDanno;
        }
}
