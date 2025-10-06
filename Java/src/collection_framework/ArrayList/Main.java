package collection_framework.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

enum Specialization {
    Cardiologist, Dermatologist, Neurologist, Pediatrician, Psychiatrist, Radiologist, Surgeon, Genral_Practitioner
}

enum IsActive {
    Yes, No
}

class Doctor {

    int id;
    String name;
    String specialization;
    int age;
    char gender;
    Specialization spec;
    IsActive isActive;

    public Doctor(int id, String name, String specialization, int age, char gender, Specialization spec,
            IsActive isActive) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.age = age;
        this.gender = gender;
        this.spec = spec;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", age=" + age
                + ", gender=" + gender + ", spec=" + spec + ", isActive=" + isActive + "]";
    }

}

public class Main {
    public static void main(String[] args) {
        List<Doctor> doctors = new ArrayList<>();
        Doctor d1 = new Doctor(1, "Dr. Smith", "Cardiology", 45, 'M', Specialization.Cardiologist, IsActive.Yes);
        Doctor d2 = new Doctor(2, "Dr. Johnson", "Dermatology", 38, 'F', Specialization.Dermatologist, IsActive.No);
        Doctor d3 = new Doctor(3, "Dr. Williams", "Neurology", 50, 'M', Specialization.Neurologist, IsActive.Yes);
        Doctor d4 = new Doctor(4, "Dr. Brown", "Pediatrics", 42, 'F', Specialization.Pediatrician, IsActive.Yes);
        Doctor d5 = new Doctor(5, "Dr. Jones", "Psychiatry", 37, 'M', Specialization.Psychiatrist, IsActive.No);
        Doctor d6 = new Doctor(6, "Dr. Garcia", "Radiology", 48, 'F', Specialization.Radiologist, IsActive.Yes);
        Doctor d7 = new Doctor(7, "Dr. Miller", "Surgery", 55, 'M', Specialization.Surgeon, IsActive.Yes);
        doctors.add(d1);
        doctors.add(d2);
        doctors.add(d3);
        doctors.add(d4);
        doctors.add(d5);
        doctors.add(d6);
        doctors.add(d7);

        doctors.remove(5);

        System.out.println(doctors.size());

        System.out.println(doctors.contains(d3));
        System.out.println(doctors.remove(5));

        System.out.println(doctors.indexOf(d4));
        System.out.println(doctors.isEmpty());
        System.out.println(doctors.get(2));

        doctors.getLast();
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
        // System.out.println(doctors);

        List<Doctor> docs = new LinkedList<>();
        docs.addAll(doctors);
        System.out.println("\n\n\nAfter adding all the elements from doctors to docs LinkedList");
        for (Doctor doctor : docs) {
            System.out.println(doctor);
        }
        // System.out.println(docs);
        doctors.clear();

        // Collection.sort(doctors, (d1, d2) -> d1.name.compareTo(d2.name));
    }

}