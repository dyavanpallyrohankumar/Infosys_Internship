package exceptionhandling;

class Studentss {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("enter the age above 0");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isBlank() || name.isEmpty()) {
			throw new IllegalArgumentException("enter name");
		}
		this.name = name;
	}

	public void demo(String name) {
		if (name.isEmpty())
			System.out.println("empty name");
		if (name.isBlank())
			System.out.println("name is blank");
	}
}

public class IlligalException {
	public static void main(String[] args) {
		Studentss st = new Studentss();
		st.demo("");
	}
}