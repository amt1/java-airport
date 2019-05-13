import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Flight flight;
    Plane plane;

    @Before
    public void before() {
        airport = new Airport(AirportCode.LHR, 5, 2);
        flight = new Flight("VS007", plane, AirportCode.LAX, Airline.VS);
        Plane plane = new Plane(TypeOfPlane.PinkyPonk, Airline.VS);
    }

    @Test
    public void hasName(){
        assertEquals("London Heathrow", airport.getName());
    }

    @Test
    public void hasAirportCode() {
        assertEquals(AirportCode.LHR, airport.getAirportCode());

    }
    @Test
    public void hasNumberOfHangars(){
        assertEquals(5, airport.getNumberHangars());
    }
    @Test
    public void hasHangarSize(){
        assertEquals(2, airport.getHangarSize());
    }
}
