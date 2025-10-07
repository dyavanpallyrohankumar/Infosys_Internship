
package overriding;

class Person {
	public void walk() {
		System.out.println("inside @person");
		System.out.println("and the person is walking");
	}
}

class Ironman extends Person {
	@Override
	public void walk() {
		// super.walk();
		System.out.println("inside @Iron Man");
		System.out.println("and the IronMan is walking");
	}
}

public class Methodoverriding {
	public static void main(String[] args) {
		Ironman obj = new Ironman();
		obj.walk();
	}
}
