package Projects.Flight_Booking_system;

public class BookingReceipt {

    private final String bookingId;
    private final String flightNumber;
    private final String passengerName;
    private final String seatNumber;
    private final int price;

    public BookingReceipt(String bookingId, String flightNumber, String passengerName, String seatNumber, int price) {
        this.bookingId = bookingId;
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookingReceipt [bookingId=" + bookingId + ", flightNumber=" + flightNumber + ", passengerName="
                + passengerName + ", seatNumber=" + seatNumber + ", price=" + price + "]";
    }

}
