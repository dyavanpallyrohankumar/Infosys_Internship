package Projects.Flight_Booking_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {

    private final Map<String, Flight> flightsByNumber = new HashMap<String, Flight>();
    private final FlightValidator validator = new FlightValidator();
    private final PaymentService paymentService = new PaymentService();

    public void addFlight(Flight f) {
        flightsByNumber.put(f.getFlightNumber(), f);
    }

    public List<Flight> searchByDestination(String destination) {
        List<Flight> res = new ArrayList<Flight>();
        for (Flight f : flightsByNumber.values()) {
            if (f.getDestination().equalsIgnoreCase(destination))
                res.add(f);
        }
        return res;
    }

    public BookingReceipt book(String flightNumber, Passenger p) throws Exception {
        // 1. validate passenger
        validator.validate(p);

        // 2. find flight
        Flight flight = flightsByNumber.get(flightNumber);
        if (flight == null) {
            throw new IllegalArgumentException("Flight not found: " + flightNumber);
        }

        // 3. allocate seat
        String seatNum = flight.allocateSeat(p.getSeatClass()); // may throw NoSeatsAvailableException
        p.setSeatNumber(seatNum);

        // 4. charge
        int price = paymentService.charge(p.getSeatClass()); // may throw PaymentFailedException

        // 5. persist booking in flight (in-memory)
        flight.addPassenger(p);

        // 6. create booking id (basic)
        String bookingId = generateBookingId(flightNumber, seatNum);
        return new BookingReceipt(bookingId, flightNumber, p.getName(), seatNum, price);
    }

    private String generateBookingId(String flightNumber, String seatNum) {
        // simple deterministic booking id
        return flightNumber + "-" + seatNum + "-" + System.currentTimeMillis() % 10000;
    }

}
