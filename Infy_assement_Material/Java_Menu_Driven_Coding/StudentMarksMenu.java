import java.util.Scanner;

public class StudentMarksMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int choice;
        do {
            System.out.println("\n--- Student Marks Menu ---");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Find Average");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < marks.length; i++) {
                        System.out.print("Enter mark for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Marks: ");
                    for (int mark : marks) System.out.print(mark + " ");
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    for (int mark : marks) sum += mark;
                    System.out.println("Average: " + (sum / (double)marks.length));
                    break;
            }
        } while (choice != 4);
    }
}
