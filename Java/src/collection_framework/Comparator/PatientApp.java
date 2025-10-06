package collection_framework.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient extends SeverityComparator {
    private String id;
    private String name;
    private int age;
    private int severity;

    public Patient(String id, String name, int age, int severity) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.severity = severity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", severity=" + severity + "]";
    }

}

public class PatientApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();
        System.out.println("Enter number of patients:");
        int n = sc.nextInt();
        sc.nextLine(); 
        while (true) {

            for (int i = 0; i < n; i++) {
                System.out.println("Enter patient id:");
                String id = sc.nextLine();
                System.out.println("Enter patient name:");
                String name = sc.nextLine();
                System.out.println("Enter patient age:");
                int age = sc.nextInt();
                System.out.println("Enter patient severity:");
                int severity = sc.nextInt();
                sc.nextLine(); 

                patients.add(new Patient(id, name, age, severity));
            }
            
            break;

        }
        patients.sort(new SeverityComparator());
        System.out.println("Patients sorted by severity:");
        for (Patient p : patients) {
            System.out.println(p);
        }
        sc.close();

    }

}