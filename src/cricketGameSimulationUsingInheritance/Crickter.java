package cricketGameSimulationUsingInheritance;

public class Crickter {
	protected String name;
	protected int age;
	protected String country;

	Crickter(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public void play() {
	}

	public void getDetails() {
		System.out.println("Crickter [name=" + name + ", age=" + age + ", country=" + country + "]");
	}
}