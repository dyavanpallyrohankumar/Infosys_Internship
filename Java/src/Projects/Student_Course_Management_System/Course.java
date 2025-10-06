package Projects.Student_Course_Management_System;

public class Course {
    private int courseId;
    private String courseName;
    private double credits;

    public Course(int courseId, String courseName, double credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName + ", credits=" + credits + "]";
    }

}
