import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("Balance: " + balance); break;
                case 2: System.out.print("Enter deposit: "); balance += sc.nextDouble(); break;
                case 3: 
                    System.out.print("Enter withdrawal: "); 
                    double amt = sc.nextDouble();
                    if (amt <= balance) balance -= amt;
                    else System.out.println("Insufficient funds!");
                    break;
            }
        } while (choice != 4);
    }
}
