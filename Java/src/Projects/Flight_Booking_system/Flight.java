package Projects.Flight_Booking_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {
    private final String flightNumber;
    private final String source;
    private final String destination;
    private final Map<SeatClass, Integer> availableSeats = new HashMap<>();
    private final Map<SeatClass, Integer> seatCounters = new HashMap<>();
    private final List<Passenger> bookedPassengers = new ArrayList<>();

    public Flight(String flightNumber, String source, String destination) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;

        availableSeats.put(SeatClass.ECONOMY, 100);
        availableSeats.put(SeatClass.BUSINESS, 100);
        availableSeats.put(SeatClass.FIRSTCLASS, 100);

        seatCounters.put(SeatClass.ECONOMY, 1);
        seatCounters.put(SeatClass.BUSINESS, 1);
        seatCounters.put(SeatClass.FIRSTCLASS, 1);
    }

    public String allocateSeat(SeatClass sc) throws NoSeatsAvailableException {
        int left = availableSeats.getOrDefault(sc, 0);
        if (left <= 0) {
            // throw new NoSeatsAvailableException("No seats available in " + sc.display());
        }
        int counter = seatCounters.getOrDefault(sc, 1);

        // need to append E B F based on class
        // String seatNumber = sc.prefix() + String.valueOf(counter);
        String seatNumber = String.valueOf(counter);
        seatCounters.put(sc, counter + 1);
        availableSeats.put(sc, left - 1);
        return seatNumber;
    }

    public void NoSeatsAvailableException() throws NoSeatsAvailableException {
        throw new NoSeatsAvailableException("No Seats Avilable to book");
    }

    public void addPassenger(Passenger p) {
        bookedPassengers.add(p);
    }

    public String getFlightSummary() {
        return String.format("Flight %s: %s -> %s | Seats [E:%d, B:%d, F:%d]",
                flightNumber, source, destination,
                getAvailableSeats(SeatClass.ECONOMY),
                getAvailableSeats(SeatClass.BUSINESS),
                getAvailableSeats(SeatClass.FIRSTCLASS));
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats(SeatClass sc) {
        return availableSeats.get(sc);
    }

    public Map<SeatClass, Integer> getSeatCounters() {
        return seatCounters;
    }

    public List<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    @Override
    public String toString() {
        return "Flight [flightNumber=" + flightNumber + ", source=" + source + ", destination=" + destination + "]";
    }

}
