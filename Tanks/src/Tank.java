public class Tank 
{
    private double maxCap;
    private double currCap;

    public Tank(double maxCap){
    this.maxCap = maxCap;
    this.currCap = 0;
    }

    public double getCapacity(){
     return maxCap;
    }

    public double getFuel(){
     return currCap;
    }

    public void fillTank(double howMuch){

        if(currCap+howMuch < maxCap){
           currCap +=howMuch;
        }else currCap = maxCap;
    }

    public void consumeFuel(double howMuch){

        if(currCap - howMuch > 0){
            currCap -= howMuch;
        }else currCap = 0;
    }

    public String toString(){
        return "serbatoio = "+ currCap +" litri";
    }

}

