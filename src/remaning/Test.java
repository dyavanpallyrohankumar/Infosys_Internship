package remaning;

class Tester {

	public static void discriminantValue(double a, double b, double c) {
		double discriminant = b * b - 4 * a * c;
		double root1 = ((-b + discriminant) / 2 * a);
		double root2 = ((-b - discriminant) / 2 * a);

		if (discriminant > 0) {
			System.out.println("The root is " + root1);
			System.out.println("The root is " + root2);
		} else if (discriminant == 0) {
			System.out.println("The root is " + root1);
		} else if (discriminant < 0) {
			System.out.println("The equation has no real root");
		}
	}

	public static void main(String[] args) {
		discriminantValue(1, 4, 4);
	}
}
