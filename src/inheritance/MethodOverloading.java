package inheritance;

class Addition {

	void additionOfNumbers(int a, int b) {

		System.out.println("the addition is" + (a + b));
	}

	void additionOfNumbers(double a, double b) {

		System.out.println("the addition is " + (a + b));
	}

	void additionOfNumbers(int a, int b, int c) {
		System.out.println("the addition is " + (a + b + c));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {

		Addition obj = new Addition();

		obj.additionOfNumbers(15, 5640, 5840);

		obj.additionOfNumbers(54.47, 684.430);

		obj.additionOfNumbers(5, 540);
	}
}