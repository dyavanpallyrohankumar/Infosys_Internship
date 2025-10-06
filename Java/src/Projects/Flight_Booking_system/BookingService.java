package Projects.Flight_Booking_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {
    final Map<String, Flight> flights = new HashMap<>();
    private final FlightValidator validator = new FlightValidator();
    private final PaymentService paymentService = new PaymentService();

    void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    List<Flight> searchByFlights = new ArrayList<>();

    List<Flight> searchByDestination(String destination) {
        List<Flight> res = new ArrayList<>();
        for (Flight flight : flights.values()) {
            if (flight.getFlightNumber().equalsIgnoreCase(destination)) {
                res.add(flight);
            }
        }
        return res;
    }

    public BookingReceipt book(String flightNumber, Passenger p) throws Exception {
        validator.validate(p);

        Flight flight = flights.get(flightNumber);
        if (flight == null) {
            throw new IllegalArgumentException("Flight Not Found");
        }

        String seatNum = flight.allocateSeat(p.getSeatClass());
        p.setSeatNumber(seatNum);

        double price = paymentService.charge(p.getSeatClass());
        flight.addPassenger(p);

        return new BookingReceipt(generateBookingId(flightNumber, seatNum), flightNumber, flightNumber, seatNum, price);
    }

    private String generateBookingId(String flightNumber, String seatNum) {
        // simple deterministic booking id
        return flightNumber + "-" + seatNum + "-" + System.currentTimeMillis() % 10000;
    }

}
