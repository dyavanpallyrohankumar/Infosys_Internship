package Projects.Flight_Booking_system;

import java.util.Scanner;
import java.util.Map.Entry;

public class FlightBookingApp {

    public static void main(String[] args) throws InvalidAgeException, InvalidPassportException, InvalidNameException,
            InvalidSeatClassException, Exception {

        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();

        while (true) {
            System.out.println("=== Flight Booking Demo ===\n");
            System.out.println("1.Add Flight\n2.Show Flights\n3.Book Flight\n.View Booked Passengers\n5.Exit");
            System.out.println("enter the choice");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Flight Number:");
                    String flightNumber = scanner.nextLine();
                    System.out.println("Enter Source:");
                    String source = scanner.nextLine();
                    System.out.println("Enter Destination:");
                    String destination = scanner.nextLine();
                    Flight newFlight = new Flight(flightNumber, source, destination);
                    bookingService.addFlight(newFlight);
                    System.out.println("Flight added successfully!");
                    break;
                case 2:
                    System.out.println("Available flights:");
                    // Assuming bookingService is accessible here
                    for (Entry<String, Flight> entry : bookingService.flights.entrySet()) {
                        System.out.println("  " + entry.getValue().getFlightSummary());
                    }
                    break;
                case 3:
                    // Booking logic can be added here
                    System.out.println("Enter Flight Number to book:");
                    String bookingFlightNumber = scanner.nextLine();
                    // Further details like passenger info can be collected here
                    System.out.println("Enter the passenger details to book the flight:");
                    System.out.println("Enter the pasanger name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter the age:");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println("Enter the passport number:");
                    String passportNumber = scanner.nextLine();
                    System.out.println("Enter the choice for \n1.ECONOMY\n2.BUSINESS\n3.FIRSTCLASS");
                    int seatChoice = scanner.nextInt();
                    SeatClass seatClass = null;
                    switch (seatChoice) {
                        case 1:
                            seatClass = SeatClass.ECONOMY;
                            break;
                        case 2:
                            seatClass = SeatClass.BUSINESS;
                            break;
                        case 3:
                            seatClass = SeatClass.FIRSTCLASS;
                            break;
                        default:
                            System.out.println("Invalid seat class choice.");
                    }
                    try {
                        BookingReceipt reciept = bookingService.book(bookingFlightNumber,
                                new Passenger(name, age, passportNumber, seatClass));
                        System.out.println(reciept);
                        System.out.println("Booking Completed Sucessfully.");
                    } catch (Exception e) {
                        System.out.println("Booking failed: " + e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println("Enter Flight Number to view booked passengers:");
                    String viewFlightNumber = scanner.nextLine();
                    Flight flight = bookingService.flights.get(viewFlightNumber);
                    if (flight != null) {
                        System.out.println("Booked passengers for flight " + viewFlightNumber + ":");
                        for (Passenger p : flight.getBookedPassengers()) {
                            System.out.printf(" - %s | Seat: %s | Class: %s%n", p.getName(), p.getSeatNumber(),
                                    p.getSeatClass());
                        }
                    } else {
                        System.out.println("Flight not found.");
                    }
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }

        // // Build services

        // // Create flights and add to service
        // Flight f1 = new Flight("AI101", "Delhi", "London");
        // Flight f2 = new Flight("AI102", "Mumbai", "London");
        // Flight f3 = new Flight("AI201", "Chennai", "Dubai");

        // bookingService.addFlight(f1);
        // bookingService.addFlight(f2);
        // bookingService.addFlight(f3);

        // // Show flights
        // System.out.println("Available flights:");
        // for (Flight f : Arrays.asList(f1, f2, f3)) {
        // System.out.println(" " + f.getFlightSummary());
        // }
        // System.out.println();

        // Passenger[] passengers = {
        // new Passenger("Test", 25, "A1B2C3D4", SeatClass.ECONOMY), // valid
        // new Passenger("", 30, "X1Y2Z3W4", SeatClass.BUSINESS), // invalid name
        // new Passenger("Aditya", 16, "AABBCC11", SeatClass.ECONOMY), // invalid age
        // new Passenger("Shashank", 28, "12", SeatClass.BUSINESS), // invalid passport
        // new Passenger("Rohit", 40, "QWERTY12", SeatClass.ECONOMY), // invalid seat
        // class
        // new Passenger("Neha", 29, "NHA12345", SeatClass.ECONOMY), // valid
        // new Passenger("Vikram", 34, "VIKR1234", SeatClass.ECONOMY) // valid but seats
        // may run out
        // };

        // // Try booking passengers on flight AI101
        // for (Passenger p : passengers) {
        // System.out.println("Attempting booking for: " + p.getName() + " -> " +
        // p.getSeatClass());
        // try {
        // BookingReceipt receipt = bookingService.book("AI101", p);
        // System.out.println(receipt);
        // } catch (InvalidNameException | InvalidAgeException |
        // InvalidPassportException | InvalidSeatClassException
        // | NoSeatsAvailableException | PaymentFailedException e) {
        // System.out.println("Booking failed: " + e.getMessage());
        // } catch (Exception e) {
        // System.out.println("Booking failed (other): " + e.getMessage());
        // }
        // System.out.println();
        // }

        // // Final passenger list for AI101
        // System.out.println("Final passenger list for AI101:");
        // for (Passenger booked : f1.getBookedPassengers()) {
        // System.out.printf(" - %s | Seat: %s | Class: %s%n", booked.getName(),
        // booked.getSeatNumber(),
        // booked.getSeatClass());
        // }

        // System.out.println("\n=== Demo completed ===");
    }

}
