package Projects.Student_Grade_Project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter student name");
            String name = sc.nextLine();
      
            System.out.println("enter thhe marks");
            int marks = sc.nextInt();
            @SuppressWarnings("unused")
			Student std = new Student(name, marks);

        } catch (InvalidGradeException e) {
            System.err.println(e.getMessage());
            sc.close();
        }
        

    }
}