package Projects.Student_Managment_System;

public interface StudentOperations {
    public void addStudent(int rollno, String sname, int marks) ;

    public void displayAll();


    void searchByRollno(int rollNo);

    public void updateMarks(int updatemarksrollnumber, int updatedmarks);

    void deleteStudent(int rollNo);

}