public class FlightTravel implements TravelStrategy{
    @Override
    public double calculateCost(double distance) {
        return distance *3.0 + 50;
    }
}
