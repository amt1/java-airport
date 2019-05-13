import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane smallPlane;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Flight flight;

    @Before
    public void before() {
        smallPlane = new Plane(TypeOfPlane.LearJet, Airline.VS);

        passenger = new Passenger("Freddy");
        passenger2 = new Passenger("Jane");
        passenger3 = new Passenger("Rod");
        passenger4 = new Passenger("Bungle");
        passenger5 = new Passenger("Zippy");
        flight = new Flight("VS007", smallPlane, AirportCode.LAX, Airline.VS);
    }

    @Test
    public void hasMaxTickets() {
        assertEquals(4, flight.getMaxTickets());
    }
    @Test
    public void hasTicketsSold() {
        assertEquals(0, flight.getTicketsSold());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("VS007", flight.getFlightNumber());
    }

    @Test
    public void hasAirlineCode() {
        assertEquals(Airline.VS, flight.getAirlineCode());
    }
    @Test
    public void hasDestinationCode() {
        assertEquals(AirportCode.LAX, flight.getDestinationCode());
    }

    @Test
    public void hasDestinationName() {
        assertEquals("Los Angeles", flight.getDestination());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void canAddPlane() {
        flight.setPlane(smallPlane);
        assertEquals( smallPlane, flight.getPlane());
    }
}
