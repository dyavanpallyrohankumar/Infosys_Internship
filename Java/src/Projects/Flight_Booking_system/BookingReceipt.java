package Projects.Flight_Booking_system;

public class BookingReceipt {
  private String bookingId;
  private String flightNumber;
  private String passengerName;
  private String seatNumber;
  private double price;

  public BookingReceipt(String bookingId, String flightNumber, String passengerName, String seatNumber,
      double price) {
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
