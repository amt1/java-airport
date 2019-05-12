import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Baggage baggage;
    Baggage baggage2;
    Baggage baggage3;
    Baggage baggage4;
    Baggage baggage5;



    @Before
    public void before() {
        passenger = new Passenger("Freddy");
        baggage = new Baggage("Cat: Spot", BaggageType.LIVE_ANIMAL);
        baggage2 = new Baggage("Red Suitcase", BaggageType.REGULAR_CHECKED);
        baggage3 = new Baggage("Car seat", BaggageType.CHILD_CAR_SEAT);
        baggage4 = new Baggage("Blue Suitcase", BaggageType.REGULAR_CHECKED);
        baggage5 = new Baggage("Umbrella Stroller", BaggageType.STROLLER);


    }

    @Test
    public void hasName() {
        assertEquals("Freddy", passenger.getName());
    }

    @Test
    public void canCheckInBaggage(){
        passenger.addBaggage(baggage);
        assertEquals(baggage, passenger.checkInBaggage(baggage.getName()));
    }

    @Test
    public void canAddBaggage(){
        passenger.addBaggage(baggage);
        assertEquals(1, passenger.countBaggage());
    }

    @Test
    public void canTallyBaggageTypes() {
        passenger.addBaggage(baggage);
        passenger.addBaggage(baggage2);
        passenger.addBaggage(baggage3);
        passenger.addBaggage(baggage4);
        passenger.addBaggage(baggage5);
        passenger.listBaggageTypes();
    }
}
