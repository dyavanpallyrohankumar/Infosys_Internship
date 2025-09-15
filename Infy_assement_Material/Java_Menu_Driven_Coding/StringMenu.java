import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int choice;

        do {
            System.out.println("\n--- String Menu ---");
            System.out.println("1. Enter String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Reverse String");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.print("Enter string: "); str = sc.next(); break;
                case 2: System.out.println("Uppercase: " + str.toUpperCase()); break;
                case 3: 
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
                    System.out.println("Reversed: " + rev);
                    break;
            }
        } while (choice != 4);
    }
}
