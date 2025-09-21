package Projects.Hospital_Management_System;

public class Patient {
    // Enter Patient

    // ID (must be unique).
    // • Enter Patient Name.
    // •

    // Enter Age (between 0 and 120).
    // • Enter Disease.
    // ✅ If all inputs are valid → Patient is stored.
    // ❌ If age is invalid → program shows "Invalid age".
    // ❌ If ID already exists → program shows "Duplicate ID".

    private int patientId;
    private String patientName;
    private int patientAge;
    private String patientDisease;

    public Patient(int patientId, String patientName, int patientAge, String patientDisease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientDisease = patientDisease;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    @Override
    public String toString() {
        return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
                + ", patientDisease=" + patientDisease + "]";
    }

}
