public class TrainTravel implements TravelStrategy{
    @Override
    public double calculateCost(double distance) {
        return distance * 0.75;
    }
}
