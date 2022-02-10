public class Rectangle {

    private int base;
    private int altezza;

    public Rectangle(int base,int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public int getAltezza() {
        return altezza;
    }
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public float area(){

        return base*altezza;
    }
    public float perimetro(){

        return 2*base+2*altezza;
    }
}
