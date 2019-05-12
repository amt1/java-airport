import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {

    plane = new Plane(TypeOfPlane.PinkyPonk, Airline.VS);

    }

    @Test
    public void planeHasType(){
        assertEquals(TypeOfPlane.PinkyPonk, plane.getType());
    }

    @Test
    public void planeHasAirlineCode(){
        assertEquals(Airline.VS, plane.getAirlineCode());
    }

    @Test
    public void planeHasAirlineName(){
        assertEquals("Virgin Atlantic", plane.getAirlineName());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(50, plane.getCapacity());
    }
}
