import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
}

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        int count = 0, choice;

        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < employees.length) {
                        employees[count] = new Employee();
                        System.out.print("Enter ID: "); employees[count].id = sc.nextInt();
                        System.out.print("Enter Name: "); employees[count].name = sc.next();
                        System.out.print("Enter Salary: "); employees[count].salary = sc.nextDouble();
                        count++;
                    } else {
                        System.out.println("Employee limit reached!");
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println(employees[i].id + " " + employees[i].name + " " + employees[i].salary);
                    }
                    break;
            }
        } while (choice != 3);
    }
}
