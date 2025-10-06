package Projects.Student_Course_Management_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Administration {
    public static void show() {
        System.out.println("===== Student Course Management =====\n" + //
                "1. Add New Student\n" + //
                "2. Add New Course\n" + //
                "3. Enroll Student in a Course\n" + //
                "4. View All Students\n" + //
                "5. View All Courses\n" + //
                "6. Search Student by ID\n" + //
                "7. Remove Courses\n" + //
                "8. Remove Student by ID\n" + //
                "9. Exit\\n" + //
                "\n\nEnter the Input");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manage = new ManagerImp();

        while (true) {
            show();
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {

                case 1:

                    System.out.println("Enter Student ID:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Student EmailID:");
                    String email = sc.nextLine();
                    manage.add_Student(id, name, email);
                    break;

                case 2:
                    System.out.println("Enter Course ID:");
                    int Cid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Course Name:");
                    String Cname = sc.nextLine();
                    System.out.println("Enter Credits");
                    double credits = sc.nextDouble();
                    manage.add_Course(Cid, Cname, credits);
                    break;

                case 3:
                    System.out.println("Enter Student ID:");
                    int assignid = sc.nextInt();
                    sc.nextLine();
                    List<Integer> courseenrolled = new ArrayList<>();
                    while (true) {
                        manage.display_Courses();
                        System.out.println("Enter course ID:  OR to Save Enter 0");
                        int courseee = sc.nextInt();
                        sc.nextLine();
                        if (courseee == 0) {
                            break;
                        }
                        courseenrolled.add(courseee);
                    }
                    manage.enrollStudents(assignid, courseenrolled);

                    break;

                case 4:
                    manage.display_Students();
                    break;

                case 5:
                    manage.display_Courses();
                    break;

                case 6:
                    System.out.println("Enter the Student ID:");
                    int sid = sc.nextInt();
                    manage.display_Student_by_ID(sid);
                    break;

                case 7:
                    System.out.println("Enter the Course ID:");
                    int cid = sc.nextInt();
                    manage.display_Student_by_ID(cid);
                    break;

                case 8:
                    System.out.println("Enter the Student ID:");
                    int rid = sc.nextInt();
                    manage.remove_Student(rid);
                    break;

                case 9:
                    System.out.println("++++++++++++++++++BYE BYE++++++++++++++++++");
                    sc.close();
                    return;

                default:
                    System.err.println("Enter Proper Input");
                    break;
            }
        }
    }
}
