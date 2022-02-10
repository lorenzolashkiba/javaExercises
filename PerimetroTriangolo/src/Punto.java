public class Punto {

    private double puntoX,puntoY;


    public Punto(double puntoX, double puntoY){
       this.puntoX = puntoX;
       this.puntoY = puntoY;
    }
    public double getPuntoX() {
        return puntoX;
    }

    public double getPuntoY() {
        return puntoY;
    }

    public void setPuntoX(double puntoX) {
        this.puntoX = puntoX;
    }

    public void setPuntoY(double puntoY) {
        this.puntoY = puntoY;
    }

    public double distanzaPunti(Punto b){
        double x = (this.puntoX-b.puntoX)*(this.puntoX-b.puntoX);
        double y = (this.puntoY-b.puntoY)*(this.puntoY-b.puntoY);
        return Math.sqrt(x+y);
    }


}
