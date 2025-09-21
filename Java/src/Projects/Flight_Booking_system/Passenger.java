package Projects.Flight_Booking_system;

public class Passenger {

	private String name;
	private int age;
	private String passportNumber;
	private SeatClass seatClass;
	private String seatNumber; // assigned when booking

	public Passenger(String name, int age, String passportNumber, SeatClass seatClass, String seatNumber) {
		super();
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
		this.seatClass = seatClass;
		this.seatNumber = seatNumber;
	}

	public Passenger(String name, int age, String passportNumber, SeatClass seatClass) {
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
		this.seatClass = seatClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public SeatClass getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(SeatClass seatClass) {
		this.seatClass = seatClass;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", passportNumber=" + passportNumber + ", seatNumber="
				+ seatNumber + "]";
	}

}
