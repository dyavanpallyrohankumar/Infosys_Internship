package Projects.Flight_Booking_system;

public class FlightValidator {

	public void validate(Passenger p) throws InvalidNameException, InvalidAgeException,
			InvalidPassportException, InvalidSeatClassException {
		validateName(p.getName());
		validateAge(p.getAge());
		validatePassport(p.getPassportNumber());
		validateSeatClass(p.getSeatClass());
	}

	public void validateName(String name) throws InvalidNameException {
		if (name == null || name.trim().isEmpty()) {
			throw new InvalidNameException("Name cannot be null or empty");
		}
	}

	public void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or older");
		}
	}

	public void validatePassport(String passport) throws InvalidPassportException {
		if (passport == null) {
			throw new InvalidPassportException("Passport number cannot be null");
		}
		String t = passport.trim();

		if (!t.matches("[A-Za-z0-9]{8}")) {
			throw new InvalidPassportException("Passport number must be exactly 8 alphanumeric characters");
		}
	}

	public void validateSeatClass(SeatClass seatClass) throws InvalidSeatClassException {
		if (seatClass == null) {
			throw new InvalidSeatClassException("Invalid or missing seat class. Use Economy, Business, or FirstClass.");
		}
	}
}
