package Projects.Flight_Booking_system;

public class FlightValidator {
    void validate(Passenger p)
            throws InvalidNameException, InvalidAgeException, InvalidPassportException, InvalidSeatClassException {
        validateName(p.name);
        validateAge(p.age);
        validatePassport(p.passportNumber);
        validateSeatClass(p.seatClass);

    }

    void validateName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Enter a Valid Name");
        }
    }

    void validateAge(int age) throws InvalidAgeException {
        if (age <= 17) {
            throw new InvalidAgeException("Enter Valid Age");
        }
    }

    void validatePassport(String passportNumber) throws InvalidPassportException {
        if (passportNumber.length() != 8) {
            throw new InvalidPassportException("Enter Valid Passport Number");
        }
    }

    void validateSeatClass(SeatClass seatClass) throws InvalidSeatClassException {
        if (seatClass == null) {
            throw new InvalidSeatClassException("Select proper Class of travel");
        }
    }

}
