
package studentgradeproject;

public class Student {

    private String name;
    private char grade;
    private int marks;

    Student(String name, int marks) {
        if (name.isEmpty() || name.isBlank())
            throw new InvalidGradeException("Invalid name");

        if (marks < 0 || marks > 100)
            throw new InvalidGradeException("entered marks " + marks + " marks should be between -1 to 101");

        this.name = name;
        this.marks = marks;
        System.out.println("Student [name=" + name + ", marks=" + marks + "]");

    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public int getMarks() {
        return marks;
    }
}