package Projects.Student_Course_Management_System;

import java.util.List;

public interface Manager {
    public void add_Student(int studentId, String name, String email);

    public void add_Course(int courseId, String courseName, double credits);

    public void remove_Student(int Sid);

    public void remove_Course(int cid);

    public void display_Students();

    public void display_Student_by_ID(int Sid);

    public void display_Courses();

    public void enrollStudents(int assignid, List<Integer> courseenrolled);

}
