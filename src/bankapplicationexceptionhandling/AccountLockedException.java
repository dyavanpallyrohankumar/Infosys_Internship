package bankapplicationexceptionhandling;

public class AccountLockedException extends Exception {

	AccountLockedException(String message) {
		super(message);
	}
}