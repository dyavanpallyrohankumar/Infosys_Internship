package Projects.Banking_Managment_System_with_Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void showMenu() {
        System.out.println(
                "\n============Banking Service===========\n1.Add customer type\n2.add Account hOlder\n3.display all\n4.exit\n enter the choice");
    }

    public static void main(String[] args) {
        BankingManagmentSystem system = new BankManagmentSystemImp(new HashMap<>());
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("enter the account type");
                    String typeofacc = sc.nextLine();
                    system.addCustomerType(typeofacc);
                    break;
                case 2:
                    System.out.println("enter the customer type");
                    String type = sc.nextLine();

                    System.out.println("enter account holder name");
                    String name = sc.nextLine();

                    System.out.println("enter account  no");
                    String accno = sc.nextLine();

                    BankAccountHolder bankAccountHolder = new BankAccountHolder(name, accno);
                    System.out.println(bankAccountHolder);
                    system.addAccountHolder(type, bankAccountHolder);
                    break;
                case 3:
                    system.displayAll();
                    break;
                case 4:
                    System.out.println("thank you for using the banking system");
                    sc.close();
                    return;
                default:
                    System.out.println("enter the proper input");
                    break;
            }

        }

    }
}
