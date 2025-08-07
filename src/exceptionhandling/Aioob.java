package exceptionhandling;

public class Aioob {

	public static void main(String[] args) {
		int arr[] = { 10, 20 };

		try {
			System.out.println(arr[3]);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
