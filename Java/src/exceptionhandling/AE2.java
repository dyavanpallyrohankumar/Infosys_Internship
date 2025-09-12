package exceptionhandling;

public class AE2 {
	public static void main(String[] args) {
		try {
			double result = 10.0 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		double result = 10.0 / 0;
		System.out.println("result" + result);
		System.out.println(result);
	}

}