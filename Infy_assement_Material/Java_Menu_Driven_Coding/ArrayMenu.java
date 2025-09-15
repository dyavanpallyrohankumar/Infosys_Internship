import java.util.Scanner;

public class ArrayMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int choice;

        do {
            System.out.println("\n--- Array Menu ---");
            System.out.println("1. Enter Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Find Max");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    for (int val : arr) System.out.print(val + " ");
                    System.out.println();
                    break;
                case 3:
                    int max = arr[0];
                    for (int val : arr) if (val > max) max = val;
                    System.out.println("Max: " + max);
                    break;
            }
        } while (choice != 4);
    }
}
