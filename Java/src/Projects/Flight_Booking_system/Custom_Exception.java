package Projects.Flight_Booking_system;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String m) {
        super(m);
    }

}

class InvalidNameException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidNameException(String m) {
        super(m);
    }
}

class InvalidPassportException extends Exception {

    public InvalidPassportException(String m) {
        super(m);
    }
}

class InvalidSeatClassException extends Exception {

    public InvalidSeatClassException(String m) {
        super(m);
    }
}

class NoSeatsAvailableException extends Exception {

    public NoSeatsAvailableException(String m) {
        super(m);
    }
}

class PaymentFailedException extends Exception {

    public PaymentFailedException(String m) {
        super(m);
    }
}

class Custom_Exception extends Exception {

    public Custom_Exception(String m) {
        super(m);
    }
}
