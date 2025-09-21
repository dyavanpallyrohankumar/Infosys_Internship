package Projects.Flight_Booking_system;

import Projects.Flight_Booking_system.*;
import java.util.Arrays;

public class FlightBookingApp {

    public static void main(String[] args) {
        System.out.println("=== Flight Booking Demo ===\n");

        // Build services
        BookingService bookingService = new BookingService();

        // Create flights and add to service
        Flight f1 = new Flight("AI101", "Delhi", "London");
        Flight f2 = new Flight("AI102", "Mumbai", "London");
        Flight f3 = new Flight("AI201", "Chennai", "Dubai");

        bookingService.addFlight(f1);
        bookingService.addFlight(f2);
        bookingService.addFlight(f3);

        // Show flights
        System.out.println("Available flights:");
        for (Flight f : Arrays.asList(f1, f2, f3)) {
            System.out.println("  " + f.getFlightSummary());
        }
        System.out.println();

        Passenger[] passengers = {
                new Passenger("Test", 25, "A1B2C3D4", SeatClass.ECONOMY), // valid
                new Passenger("", 30, "X1Y2Z3W4", SeatClass.BUSINESS), // invalid name
                new Passenger("Aditya", 16, "AABBCC11", SeatClass.ECONOMY), // invalid age
                new Passenger("Shashank", 28, "12", SeatClass.BUSINESS), // invalid passport
                new Passenger("Rohit", 40, "QWERTY12", SeatClass.ECONOMY), // invalid seat class
                new Passenger("Neha", 29, "NHA12345", SeatClass.ECONOMY), // valid
                new Passenger("Vikram", 24, "VIKR1234", SeatClass.ECONOMY), // valid but seats may run out
                new Passenger("Vikram", 44, "VIKR1234", SeatClass.ECONOMY), // valid but seats may run out
                new Passenger("Vikram", 54, "VIKR1234", SeatClass.ECONOMY), // valid but seats may run out
                new Passenger("Vikram", 64, "VIKR1234", SeatClass.ECONOMY) // valid but seats may run out

        };

        // Try booking passengers on flight AI101
        for (Passenger p : passengers) {
            System.out.println("Attempting booking for: " + p.getName() + " -> " + p.getSeatClass());
            try {
                BookingReceipt receipt = bookingService.book("AI101", p);
                System.out.println(receipt);
            } catch (InvalidNameException | InvalidAgeException | InvalidPassportException | InvalidSeatClassException
                    | NoSeatsAvailableException | PaymentFailedException e) {
                System.out.println("Booking failed: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Booking failed (other): " + e.getMessage());
            }
            System.out.println();
        }

        // Final passenger list for AI101
        System.out.println("Final passenger list for AI101:");
        for (Passenger booked : f1.getBookedPassengers()) {
            System.out.printf(" - %s | Seat: %s | Class: %s%n", booked.getName(), booked.getSeatNumber(),
                    booked.getSeatClass());
        }

        System.out.println("\n=== Demo completed ===");
    }

}
