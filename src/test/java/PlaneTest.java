import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Plane smallPlane;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;


    @Before
    public void before() {

    plane = new Plane(TypeOfPlane.PinkyPonk, Airline.VS);
    smallPlane = new Plane(TypeOfPlane.LearJet, Airline.VS);

        passenger = new Passenger("Freddy");
        passenger2 = new Passenger("Jane");
        passenger3 = new Passenger("Rod");
        passenger4 = new Passenger("Bungle");
        passenger5 = new Passenger("Zippy");


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
    @Test
    public void planeHasPassengerCount(){
        assertEquals(0, plane.countPassengers());
    }
    @Test
    public void planeCanAddPassenger(){
        plane.addPassenger(passenger);
        assertEquals(1, plane.countPassengers());
    }
    @Test
    public void planeCanLetOutPassenger(){
        plane.addPassenger(passenger);
        plane.letOutPassenger("Freddy");
        assertEquals(0, plane.countPassengers());
    }
    @Test
    public void planeCanLetOutOriginalPassenger(){
        plane.addPassenger(passenger);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger3);

        assertEquals(passenger, plane.letOutPassenger("Freddy"));
    }
    @Test
    public void planeCanLetOutAllPassengers(){
        plane.addPassenger(passenger);
        plane.addPassenger(passenger2);
        plane.addPassenger(passenger3);
        plane.letAllPassengersOut();
        assertEquals(0, plane.countPassengers());
    }

    @Test
    public void planeCanBeFull(){
        smallPlane.addPassenger(passenger);
        smallPlane.addPassenger(passenger2);
        smallPlane.addPassenger(passenger3);
        smallPlane.addPassenger(passenger4);
        assertEquals(true,smallPlane.isFull());
    }

    @Test
    public void planeCanHaveSpaceLeft(){
        smallPlane.addPassenger(passenger);
        smallPlane.addPassenger(passenger2);
        smallPlane.addPassenger(passenger3);
        assertEquals(false,smallPlane.isFull());
    }
    @Test
    public void planeCanBeFull2(){
        smallPlane.addPassenger(passenger);
        smallPlane.addPassenger(passenger2);
        smallPlane.addPassenger(passenger3);
        smallPlane.addPassenger(passenger4);
        assertEquals(false,smallPlane.hasSeatsLeft());
    }

    @Test
    public void planeCanHaveSpaceLeft2(){
        smallPlane.addPassenger(passenger);
        smallPlane.addPassenger(passenger2);
        smallPlane.addPassenger(passenger3);
        assertEquals(true,smallPlane.hasSeatsLeft());
    }
}
