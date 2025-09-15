import java.util.Scanner;

public class StudentGradeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, mark = 0;

        do {
            System.out.println("\n--- Student Grade Menu ---");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Grade");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.print("Enter marks (0-100): "); mark = sc.nextInt(); break;
                case 2: 
                    if (mark >= 90) System.out.println("Grade: A");
                    else if (mark >= 75) System.out.println("Grade: B");
                    else if (mark >= 50) System.out.println("Grade: C");
                    else System.out.println("Grade: Fail");
                    break;
            }
        } while (choice != 3);
    }
}
