package bankapplicationexceptionhandling;

public class InSufficientBalanceException extends Exception {
	public InSufficientBalanceException(String message) {
		super(message);
	}

}
