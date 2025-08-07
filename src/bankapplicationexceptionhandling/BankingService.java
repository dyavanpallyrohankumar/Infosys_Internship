
package bankapplicationexceptionhandling;

public class BankingService {

	private int loginAttempt = 0;

	private double Balance = 327846;

	public boolean login(String username, String password) throws AccountLockedException, InvalidCredintals {

		if (loginAttempt >= 3) {

			throw new AccountLockedException("you have already tried 3 times come 24 hrs after");

		}

		if (!username.equals("admin") || !password.equals("123456")) {

			loginAttempt++;

			throw new InvalidCredintals("Invalid Credentials please try again");

		}

		System.out.println("Login sucessful go ahead");

		return true;

	}

	public void checkBalance() {

		System.out.println("the balance is " + Balance);
	}

	public void debitAmount(double Amount) throws InSufficientBalanceException {

		if (Balance <= 0 || Amount > Balance) {
			throw new InSufficientBalanceException("there is a insufficient balance");

		}

		Balance = Balance - Amount;

		System.out.println("Withdrawl sucessful of " + Amount + " and balance is " + Balance);

	}

	public void creditAmount(double Amount) throws InSufficientBalanceException {

		if (Amount <= 0) {
			throw new InSufficientBalanceException("Amount must be above 0");

		}

		Balance = Balance + Amount;

		System.out.println("Deposit sucessful of " + Amount + " and balance is " + Balance);
	}
}
