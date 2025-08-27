
package abstraction;

// we cant create a object for the abstract class

abstract class Subject {

	public int marks;

	public final int MIN_MARKS = 0;

	public abstract void teaching();

	public int totalmarks() {

		return 100;

	}

}

class Mathametics extends Subject {

	@Override

	public void teaching() {
		System.out.println("i am trying to teach maths");
	}
}

public class Abstraction {

}