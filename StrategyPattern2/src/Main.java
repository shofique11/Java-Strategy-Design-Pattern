//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TravelContext travelContext = new TravelContext();
        double distance =100; // distance in kilometer

        // calculate cost using Bus Travel
        travelContext.setTravelStrategy(new BusTravel());
        System.out.println("Bus travel cost: $"+ travelContext.calculateCost(distance));

        // Calculate cost using train Travel
        travelContext.setTravelStrategy(new TrainTravel());
        System.out.println("Train Travel coast: $"+travelContext.calculateCost(distance));

        // calculate using Flight cost

        travelContext.setTravelStrategy(new FlightTravel());
        System.out.println("Flight Travel coast: $"+travelContext.calculateCost(distance));

    }
}