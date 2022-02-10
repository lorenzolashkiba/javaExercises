public class IrishTank extends Tank
{
    /**
     * La quantit� di litri a cui equivale un gallone
     */
    public static final double GALLON_TO_LITERS = 4.54609;

    public IrishTank(double maxCap) {
        super(maxCap*GALLON_TO_LITERS);
    }

    @Override
    public double getFuel() {
        return super.getFuel()/GALLON_TO_LITERS;
    }

    public void fillTankGallon(double howMuch, int um){
        if(um==1){
            fillTank(howMuch);
        }else fillTank(howMuch*GALLON_TO_LITERS);
    }

    public void consumeFuelGallon(double howMuch,int um){
        if(um==1){
            consumeFuel(howMuch);
        }else consumeFuel(howMuch*GALLON_TO_LITERS);
    }

    @Override
    public String toString() {
        return " serbatoio = "+ this.getFuel() + " gallons ";
    }
}
