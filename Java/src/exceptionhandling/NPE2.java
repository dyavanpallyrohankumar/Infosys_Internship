package exceptionhandling;

public class NPE2 {
	public static void main(String[] args) {
		try {
			int[] array = null;
			System.out.println(array.length);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
