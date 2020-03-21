import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){passenger = new Passenger("Bob",3);}

    @Test
    public void passengerHasName(){assertEquals("Bob", passenger.getName());}

    @Test
    public void passengerHasBags(){assertEquals(3, passenger.countBags());}
}
