import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    private Flight flight1;
    private Passenger passenger1;
    private Passenger passenger2;


    @Before
    public void before(){
        flight1 = new Flight(Plane.BOEING747, "Edinburgh", "Flight1", "Glasgow", "October");
        passenger1 = new Passenger("John",2);
        passenger2 = new Passenger("Ceylan",3);
    }

    @Test
    public void flightHasName(){
        assertEquals(Plane.BOEING747, flight1.getPlane());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Edinburgh", flight1.getDestination());
    }

    @Test
    public void flightHasNumber(){
        assertEquals("Flight1", flight1.getFlightNumber());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("Glasgow", flight1.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("October", flight1.getDepartureTime());
    }

    @Test
    public void flightCanGetPlaneCapacity(){
        assertEquals(50,flight1.getPlaneCapacity());
    }

    @Test
    public void flightCanGetNumberOfPassengers(){
        assertEquals(0,flight1.getNumberOfPassengers()); }

    @Test
    public void flightCanAddPassenger(){
        flight1.addPassenger(passenger1);
        assertEquals(1,flight1.getNumberOfPassengers());}
}
