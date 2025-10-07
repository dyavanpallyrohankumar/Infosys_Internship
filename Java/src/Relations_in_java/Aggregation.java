package Relations_in_java;

// Aggregation is a has-a relation 
// one class contains the reference of another class but the contained object can exist independently of the container 

class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

}

class Department {
    String deptName;
    Teacher teacher;

    public Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }

}

public class Aggregation {
    public static void main(String[] args) {

    }
}
