package Multithreading_and_Thread_Safety.Bank_ATM_system;

public class BankSimulation {
    public static void main(String[] args) throws InterruptedException {
        Account sharedAccount = new Account(10000);

        Thread t1 = new Thread(new ATM(sharedAccount, 700, "Alice"));
        Thread t2 = new Thread(new ATM(sharedAccount, 500, "Bob"));
        Thread t3 = new Thread(new ATM(sharedAccount, 500, "Raj"));
        Thread t4 = new Thread(new ATM(sharedAccount, 100, "rk"));
        Thread t5 = new Thread(new ATM(sharedAccount, 1000, "sgd"));
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(t4.getName());
        t1.start();
        t4.start();
        t4.sleep(1542);
        System.out.println(t1.getName());
        t3.start();
        t5.start();
        t2.start();
    }
}
