public class BusTravel implements TravelStrategy{
    public double calculateCost(double distance){
        return distance * .05;
    }
}
