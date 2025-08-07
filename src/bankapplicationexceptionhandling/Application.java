package bankapplicationexceptionhandling;

import java.util.Scanner;

public class Application {

	public static void main(String[] args)
			throws InvalidOperatorException, AccountLockedException, InvalidCredintals, InSufficientBalanceException {
		BankingService service = new BankingService();
		Scanner sc = new Scanner(System.in);
		String username, password;
		while (true) {
			System.out.println("enter the username and passdword");
			username = sc.nextLine();
			password = sc.nextLine();
			try {
				service.login(username, password);
				break;
			} catch (InvalidCredintals e) {
				System.err.println(e.getMessage());
			} catch (AccountLockedException e) {
				System.err.println(e.getMessage());
				sc.close();
				return;
			}
		}
		while (true) {
			System.out.println("\n-Banking Menu----------");
			System.out.println("1.Withdrawl");
			System.out.println("2.Deposit");
			System.out.println("3.Check balance");
			System.out.println("4.Exit");
			System.out.println("choose an option");
			int choice = sc.nextInt();
			sc.nextLine();
			try {
				switch (choice) {
				case 1:
					System.out.println("enter the amount to withdrawl");
					double wamount = sc.nextDouble();
					service.debitAmount(wamount);
					break;
				case 2:
					System.out.println("enter the amount to Deposit");
					int camount = sc.nextInt();
					service.creditAmount(camount);
					break;
				case 3:
					service.checkBalance();
					break;
				case 4:
					System.out.println("thank you visit again");
					return;
				default:
					System.out.println("enter proper input");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
