package Projects.Bank_Application_Using_Exceptionhandling;

public class AccountLockedException extends Exception {

	AccountLockedException(String message) {
		super(message);
	}
}