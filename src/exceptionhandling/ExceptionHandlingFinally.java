package exceptionhandling;

public class ExceptionHandlingFinally {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		System.out.println("this is the final block");
	}
}