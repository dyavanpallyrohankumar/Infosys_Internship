package Projects.Hospital_Management_System;

public interface HMS {
    void addPatient(int pid, String pname, int page, String pd) throws Exception;

    void addDoctor(int did, String dname, int dage, String ds) throws Exception;

    void displayPatients();

    void displayDoctors();

    void assignDoctor(int adid, int apid);
}
