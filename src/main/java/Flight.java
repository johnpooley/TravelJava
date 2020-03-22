import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String destination;
    private String flightNumber;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane, String destination, String flightNumber, String departureAirport, String departureTime){
        this.plane = plane;
        this.destination=destination;
        this.flightNumber=flightNumber;
        this.departureAirport=departureAirport;
        this.departureTime=departureTime;
        this.passengers = new ArrayList<Passenger>();

    }

    public Plane getPlane(){return plane;}
    public void setPlane(Plane plane){this.plane = plane;}

    public String getDestination(){return destination;}
    public void setDestination(String destination) { this.destination = destination; }

    public String getFlightNumber() {return flightNumber;}

    public String getDepartureAirport() { return departureAirport;}

    public String getDepartureTime() {return departureTime;}

    public int getPlaneCapacity() { return plane.getCapacity();}

    public int getNumberOfPassengers(){ return passengers.size();}

    public void addPassenger(Passenger passenger) {
        if(this.plane.getCapacity() > this.getNumberOfPassengers()){
            this.passengers.add(passenger);
        }
    }
}
