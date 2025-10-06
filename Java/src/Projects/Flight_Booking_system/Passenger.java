package Projects.Flight_Booking_system;

public class Passenger {
    protected String name;
    protected int age;
    protected String passportNumber;
    protected SeatClass seatClass;
    protected String seatNumber;

    public Passenger(String name, int age, String passportNumber, SeatClass seatClass)
            throws InvalidAgeException, InvalidPassportException, InvalidNameException, InvalidSeatClassException {
        setName(name);
        setAge(age);
        setPassportNumber(passportNumber);
        setSeatClass(seatClass);
        // this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Enter a Valid Name");
        } else
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age >= 18) {
            this.age = age;
        } else
            throw new InvalidAgeException("Enter Valid Passport Number");
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) throws InvalidPassportException {
        if (passportNumber.length() != 8) {
            throw new InvalidPassportException("Enter Valid Passport Number");
        } else
            this.passportNumber = passportNumber;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(SeatClass seatClass) throws InvalidSeatClassException {
        if (seatClass == null) {
            throw new InvalidSeatClassException("Select proper Class of travel");
        } else
            this.seatClass = seatClass;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNum) {
        this.seatNumber = seatNum;
    }

    @Override
    public String toString() {
        return "Passenger [name=" + name + ", age=" + age + ", passportNumber=" + passportNumber + ", seatClass="
                + seatClass + ", seatNumber=" + seatNumber + "]";
    }

}
