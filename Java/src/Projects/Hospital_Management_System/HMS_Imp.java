package Projects.Hospital_Management_System;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HMS_Imp implements HMS {
    List<Patient> patients = new ArrayList<>();
    List<Doctor> doctors = new ArrayList<>();
    Map<Doctor, List<Patient>> assign = new HashMap<>();

    @Override
    public void addPatient(int pid, String pname, int page, String pd) throws Exception {
        for (Patient patient : patients) {
            if (pid == patient.getPatientId()) {
                throw new Exception("Id Already Exist");
            }
        }

        if (page > 0 && page < 120) {
            patients.add(new Patient(pid, pname, page, pd));
            System.out.println("👌 Patient Added Sucessfully");
        } else {
            throw new Exception("Enter the valid age");
        }

    }

    @Override
    public void addDoctor(int did, String dname, int dage, String ds) throws Exception {
        for (Doctor doctor : doctors) {
            if (did == doctor.getDoctorId()) {
                throw new Exception("Id Already Exist");
            }
        }

        if (dage > 0 && dage < 120) {
            doctors.add(new Doctor(did, dname, dage, ds));
            System.out.println("👌 Patient Added Sucessfully");
        } else {
            throw new Exception("Enter the valid age");
        }
    }

    @Override
    public void assignDoctor(int adid, int apid) {

        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == adid) {
                List<Patient> assignedPatients = assign.getOrDefault(doctor, new ArrayList<>());
                for (Patient patient : patients) {
                    if (patient.getPatientId() == apid) {
                        assignedPatients.add(patient);
                        assign.put(doctor, assignedPatients);
                        break;
                    }
                }
            }
        }
        System.out.println(assign);
    }

    @Override
    public void displayPatients() {
        if (!patients.isEmpty()) {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        } else {
            System.out.println("There is no patients Avilable");
        }
    }

    @Override
    public void displayDoctors() {
        if (!doctors.isEmpty()) {
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        } else {
            System.out.println("There is no Doctors Avilable");
        }
    }

}
