package Projects.Hospital_Management_System;

public class Doctor {

    private int doctorId;
    private String doctorName;
    private int doctorAge;
    private String doctorSpecialization;

    public Doctor(int doctorId, String doctorName, int doctorAge, String doctorSpecialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
        this.doctorSpecialization = doctorSpecialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }

    @Override
    public String toString() {
        return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge=" + doctorAge
                + ", doctorSpecialization=" + doctorSpecialization + "]";
    }

}
