package Projects.Student_Managment_System;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentOperations {
    List<Student> studentObjects = new ArrayList<>();

    @Override
    public void addStudent(int rollno, String sname, int marks){
        Student std = new Student(rollno, sname, marks);
        for (Student student : studentObjects) {
            if (student.getRollno()==rollno) {
                System.out.println("alredy there is a rollnumber present change it");
                
            }
        }
        studentObjects.add(std);
    }

    @Override
    public void displayAll() {
        for (Student student : studentObjects) {
            System.out.println(student);
        }
       
    }

    @Override
    public void updateMarks(int updatemarksrollnumber, int updatedmarks) {
        for (Student student : studentObjects) {
            if (student.getRollno() == updatemarksrollnumber) {
                student.setMarks(updatedmarks);

            } else
                System.out.println("Student not found");
        }
    }

    @Override
    public void searchByRollno(int rollNo) {
        for (Student student : studentObjects) {
            if (student.getRollno() == rollNo) {
                System.out.println(student);
            }
        }
    }

    @Override
    public void deleteStudent(int rollNo) {
        for (Student student : studentObjects) {
            if (student.getRollno() == rollNo) {
                System.out.println("Student details are " + student);
                studentObjects.remove(student);
            }
        }
    }
}
