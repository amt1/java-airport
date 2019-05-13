import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    Ticket ticket;

    @Before
    public void before() {
        ticket = new Ticket("Freddy", "VS007");

    }

    @Test
    public void hasPassengerName(){
        assertEquals("Freddy", ticket.getPassengerName());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("VS007", ticket.getFlightNumber());
    }
}
