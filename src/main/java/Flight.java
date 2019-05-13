import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int ticketsSold = 0;
    private int maxTickets;
    private String flightNumber;
    private String destination;
    private AirportCode destinationCode;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, Plane plane, AirportCode destinationCode){
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.destinationCode = destinationCode;
        this.maxTickets = plane.getCapacity();
        this.destination = destinationCode.getName();
        this.passengers = new ArrayList<>();
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public int countPassengers() {
        return passengers.size();
    }

    public int getMaxTickets() {
        return maxTickets;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public AirportCode getDestinationCode() {
        return destinationCode;
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
}
