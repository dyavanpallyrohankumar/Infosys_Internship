package Projects.Student_Managment_System;


import java.util.Scanner;

public class StudentManagmentSystem {
    public static void showMenu() {
        System.out.println(
                "\n\n------------------Student Mangment System-------------------\n1.Add Student\n2.View all Students\n3.Search Student by ID\n4.Update Student Marks\n5.Delete Student\n6.Exit\nEnter Choice");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentOperations student = new StudentManager();
        while (true) {
            showMenu();
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    // Add Student
                    System.out.println("Enter the Roll number");
                    int rollno = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Student name");
                    String sname = sc.nextLine();
                    System.out.println("Enter the Marks");
                    int marks = sc.nextInt();
                    student.addStudent(rollno, sname, marks);
                    break;
                case 2:
                    // View all Students
                    System.out.println("this list of students are ======================");
                    student.displayAll();

                    break;
                case 3:
                    // Search Student by ID
                    System.out.println("enter the Roll number to be ");
                    int searchRoll = sc.nextInt();
                    sc.nextLine();
                    student.searchByRollno(searchRoll);

                    break;
                case 4:
                    // Update Student Marks
                    System.out.println("enter the Roll number to Update marks ");
                    int updatemarksrollnumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter the marks need to be Updated ");
                    int updatedmarks = sc.nextInt();
                    sc.nextLine();
                    student.updateMarks(updatemarksrollnumber, updatedmarks);

                    break;
                case 5:
                    // Delete Student
                    System.out.println("enter the Roll number to be Deleted ");
                    int deleterollnumber = sc.nextInt();
                    sc.nextLine();
                    student.deleteStudent(deleterollnumber);

                    break;
                case 6:
                    System.out.println("thank QQQQQQQQQQQQQ Visit Again");
                    sc.close();
                    return;

                default:
                    System.out.println("enter the proper input");
                    break;
            }
        }
    }
}