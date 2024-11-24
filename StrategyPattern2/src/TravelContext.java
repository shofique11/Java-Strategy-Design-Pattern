public class TravelContext {
    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }
    public double calculateCost(double distance)
    {
        if(travelStrategy == null){
            throw  new IllegalStateException("Travel strategy is not set");
        }

        return travelStrategy.calculateCost(distance);
    }
}
