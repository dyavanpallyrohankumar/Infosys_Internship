package Projects.Flight_Booking_system;

class InvalidNameException extends Exception {
    public InvalidNameException(String msg) {
        super(msg);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class InvalidPassportException extends Exception {
    public InvalidPassportException(String msg) {
        super(msg);
    }
}

class InvalidSeatClassException extends Exception {
    public InvalidSeatClassException(String msg) {
        super(msg);
    }
}

class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}


public class Custom_Exceptions extends Exception {

    public Custom_Exceptions(String msg) {
        super(msg);
    }
}
