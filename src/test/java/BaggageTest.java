import static org.junit.Assert.*;
import org.junit.*;

public class BaggageTest {

    Baggage baggage;

    @Before
    public void before() {
        baggage = new Baggage("Cat: Spot", BaggageType.LIVE_ANIMAL);
    }

    @Test
    public void hasName() {
        assertEquals("Cat: Spot", baggage.getName());
    }

    @Test
    public void hasTransportationType() {
        assertEquals(BaggageType.LIVE_ANIMAL, baggage.getTransportationType());
    }
}
