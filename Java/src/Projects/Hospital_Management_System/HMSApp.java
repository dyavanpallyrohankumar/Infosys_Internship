package Projects.Hospital_Management_System;

import java.util.Scanner;

public class HMSApp extends Exception {
    public static void main(String[] args) throws Exception {
        HMS hospital = new HMS_Imp();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Patient\r\n" + //
                    "2. Add Doctor\r\n" + //
                    "3. Assign Patient to Doctor\r\n" + //
                    "4. View All Patients\r\n" + //
                    "5. View All Doctors\r\n" + //
                    "6. Exit\n \n Enter your choice");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    // 3.1 Add Patient
                    System.out.println("Enter the id");
                    int pid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Name");
                    String pname = sc.nextLine();
                    System.out.println("Enter the Age");
                    int page = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Disease");
                    String pd = sc.nextLine();
                    hospital.addPatient(pid, pname, page, pd);
                    break;
                case 2:
                    // 3.2 Add Doctor
                    System.out.println("Enter the id");
                    int did = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Name");
                    String dname = sc.nextLine();
                    System.out.println("Enter the Age");
                    int dage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Specialization");
                    String ds = sc.nextLine();
                    hospital.addDoctor(did, dname, dage, ds);
                    break;
                case 3:
                    // 3.3 Assign Patient to Doctor
                    System.out.println("Enter the Doctor ID");
                    int adid = sc.nextInt();
                    System.out.println("Enter the Patient ID");
                    int apid = sc.nextInt();
                    hospital.assignDoctor(adid, apid);
                    break;
                case 4:
                    hospital.displayPatients();
                    // 3.4 View All Patients
                    break;
                case 5:
                    hospital.displayDoctors();
                    // 3.5 View All Doctors
                    break;
                case 6:
                    // 3.6 Exit
                    sc.close();
                    return;

                default:
                    System.err.println("Enter valid Input");
                    break;
            }

        }

    }
}
