package Genric_Implementation;

class Patient<T, U> {
    int id;
    String name;
    int age;
    T gender;
    U status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }

    public U getStatus() {
        return status;
    }

    public void setStatus(U status) {
        this.status = status;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // return "SeniorHR [id=" + id + ", region=" + region + ", name=" + name + ",
        // dept=" + dept + ", yearOfExe="
        // + yearOfExe + ", isHeadofdept=" + isHeadofdept + "]";
        return super.toString();
    }

}

// Remove public enum Status from this file.
// Create Status.java in the same package with the following content:

// Generic class Patient with two type parameters T and U
// T represents
// U represents
// Attributes
// id: Integer representing the patient's ID
// name: String representing the patient's name
// age: Integer representing the patient's age

public class PatientImplementation {
    public static void main(String[] args) {
        // Creating an instance of Patient with String
        Patient<String, String> patient1 = new Patient<>();
        patient1.setId(1);
        patient1.setName("John Doe");
        patient1.setAge(30);
        patient1.setGender("Male");
        patient1.setStatus("Present");

        Patient<Character, Boolean> patient2 = new Patient<Character, Boolean>();
        patient2.setId(1);
        patient2.setName("John Doe");
        patient2.setAge(30);
        patient2.setGender('M');
        patient2.setStatus(true);

        Patient<Character, Status> patient3 = new Patient<Character, Status>();
        patient3.setId(1);
        patient3.setName("John Doe");
        patient3.setAge(30);
        patient3.setGender('M');
        patient3.setStatus(Status.Active);
    }
}
