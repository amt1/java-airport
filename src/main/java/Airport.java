import java.lang.reflect.Array;
import java.util.ArrayList;

public class Airport {

    private AirportCode airportCode;
    private String name;
    private int numberHangars;
    private int hangarSize;
    private ArrayList<Hangar> hangars;
    private Hangar hangar;
    private Flight flight;

    public Airport( AirportCode airportCode, int numberHangars, int hangarSize) {
        this.airportCode = airportCode;
        this.name = airportCode.getName();
        this.numberHangars = numberHangars;
        this.hangarSize = hangarSize;
        this.hangars = new ArrayList<>();
        for (int i = 0; i < numberHangars; i++){
            hangars.add(new Hangar(hangarSize));
        }
    }

    public AirportCode getAirportCode() {
        return airportCode;
    }

    public String getName() {
        return name;
    }

    public int getNumberHangars() {
        return numberHangars;
    }

    public int getHangarSize() {
        return hangarSize;
    }

    public Flight createFlight(){
        Plane plane = new Plane(TypeOfPlane.PinkyPonk, Airline.VS);
        Hangar hangar = hangars.get(0);
        hangar.addPlane(plane);
        flight = new Flight("VS007", hangar.letOut(plane), AirportCode.LAX, Airline.VS);
        // ok I haven't thought through where the flight numbers come from
        // or how / what planes get into hangars!
        // or tested this function yet
        return flight;
    }

    public void sellTicket(Passenger passenger, Flight flight){
        if (flight.getPlane().hasSeatsLeft()) {
            Ticket ticket = new Ticket(passenger.getName(), flight.getFlightNumber());
            passenger.addTicket(ticket);
            flight.addPassenger(passenger);
        }
    }
}
