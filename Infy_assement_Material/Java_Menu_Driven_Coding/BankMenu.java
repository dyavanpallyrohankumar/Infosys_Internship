import java.util.Scanner;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.print("Enter amount: "); acc.deposit(sc.nextDouble()); break;
                case 2: System.out.print("Enter amount: "); acc.withdraw(sc.nextDouble()); break;
                case 3: acc.displayBalance(); break;
            }
        } while (choice != 4);
        sc.close();
    }
}
