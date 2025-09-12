package Projects.Bank_Application_Using_Exceptionhandling;

public class InSufficientBalanceException extends Exception {
	public InSufficientBalanceException(String message) {
		super(message);
	}

}
