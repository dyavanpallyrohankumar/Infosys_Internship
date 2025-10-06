package Projects.Student_Course_Management_System;

import java.util.List;

public class Student extends Person {
    private int studentId;
    List<Course> coursesEnrolled;

    public Student(String name, String email, int studentId) {
        super(name, email);
        this.studentId = studentId;
        // this.coursesEnrolled = coursesEnrolled;
    }

    public void setCoursesEnrolled(List<Course> coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", coursesEnrolled=" + coursesEnrolled + ", Name=" + getName()
                + ", Email=" + getEmail() + "]";
    }

}
