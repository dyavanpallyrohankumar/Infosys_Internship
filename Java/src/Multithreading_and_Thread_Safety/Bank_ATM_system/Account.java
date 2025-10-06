package Multithreading_and_Thread_Safety.Bank_ATM_system;

class Account {
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

    // Thread-safe withdrawal
    public synchronized void withdraw(int amount, String person) {
        if (balance >= amount) {
            System.out.println(person + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(person + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(person + " cannot withdraw " + amount + ". Insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
