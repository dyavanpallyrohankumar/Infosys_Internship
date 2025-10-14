package Java_Beyond_Basics.Lambda_Expression;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name, gender, department;
    int age;

    public Student(String name, String gender, String department, int age) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gender=" + gender + ", department=" + department + ", age=" + age + "]";
    }

}

public class StudentApp {
    // public static void main(String[] args) {
    // List<Student> list = new ArrayList<>();
    // Student s1 = new Student("Alice", "Female", "Computer Science", 20);
    // Student s2 = new Student("Bob", "Male", "Mathematics", 22);
    // Student s3 = new Student("Charlie", "Male", "Physics", 21);
    // Student s4 = new Student("Deepak", "Male", "Chemistry", 23);
    // Student s5 = new Student("Eve", "Female", "Biology", 20);
    // Student[] students = { s1, s2, s3, s4, s5 };
    // for (Student student : students) {
    // list.add(student);
    // }
    // System.out.println("sorting by age");
    // list.sort(new sorting_by_age());

    // for (Student studentss : list) {
    // System.out.println(studentss);
    // }
    // System.out.println("sorting by name");
    // list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

    // for (Student studentss : list) {
    // System.out.println(studentss);
    // }
    // System.out.println("sorting by name length");
    // list.sort(new sorting_by_nameLength());

    // for (Student studentss : list) {
    // System.out.println(studentss);
    // }
    // System.out.println("sorting by department");
    // list.sort(new sorting_by_dept());

    // for (Student studentss : list) {
    // System.out.println(studentss);
    // }

    // }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("Alice", "Female", "Computer Science", 20);
        Student s2 = new Student("Bob", "Male", "Mathematics", 22);
        Student s3 = new Student("Charlie", "Male", "Physics", 21);
        Student s4 = new Student("Deepak", "Male", "Chemistry", 23);
        Student s5 = new Student("Eve", "Female", "Biology", 20);
        Student[] students = { s1, s2, s3, s4, s5 };
        for (Student student : students) {
            list.add(student);
        }
        System.out.println("sorting by age");
        list.sort((o1, o2) -> o2.getAge() - o1.getAge());

        for (Student studentss : list) {
            System.out.println(studentss);
        }
        System.out.println("sorting by name");
        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Student studentss : list) {
            System.out.println(studentss);
        }
        System.out.println("sorting by name length");
        list.sort((o1, o2) -> o1.getName().length() - o2.getName().length());

        for (Student studentss : list) {
            System.out.println(studentss);
        }
        System.out.println("sorting by department");
        list.sort((o1, o2) -> o1.getDepartment().compareTo(o2.getDepartment()));

        for (Student studentss : list) {
            System.out.println(studentss);
        }

    }
}