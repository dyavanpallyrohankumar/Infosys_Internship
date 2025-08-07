package exceptionhandling;

public class NPE1 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("the length is " + str.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}