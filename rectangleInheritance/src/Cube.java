public class Cube extends Rectangle {

        public Cube(int base){
            super(base,base);
        }

    @Override
    public void setBase(int base) {
        super.setBase(base);
        super.setAltezza(base);
    }

    @Override
    public void setAltezza(int altezza) {
        setBase(altezza);
    }
}
