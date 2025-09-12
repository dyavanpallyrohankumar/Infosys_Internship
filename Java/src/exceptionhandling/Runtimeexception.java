package exceptionhandling;

public class Runtimeexception {
	public void placeorder(String productId, int quantity) {
		if (productId == null || productId.isEmpty())
			throw new IllegalArgumentException("entered invalid productid");
		if (quantity < 0)
			throw new IllegalArgumentException("mustbe above 0");
		System.out.println("order placed productId + & quantity is" + quantity);
	}

	public static void main(String[] args) {
		Runtimeexception exp = new Runtimeexception();
		exp.placeorder("gun", 2);// works
		exp.placeorder("", 2);
	}
}