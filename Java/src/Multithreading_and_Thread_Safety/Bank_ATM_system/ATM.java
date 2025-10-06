package Multithreading_and_Thread_Safety.Bank_ATM_system;

class ATM implements Runnable {
    private Account account;
    private int amount;
    private String person;

    ATM(Account account, int amount, String person) {
        this.account = account;
        this.amount = amount;
        this.person = person;
    }

    @Override
    public void run() {
        account.withdraw(amount, person);
    }
}
