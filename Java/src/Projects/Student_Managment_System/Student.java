package Projects.Student_Managment_System;

/*
Description About Project

This is Program about the Student managment system where we can perform operations like
1.Add Student
	used to add the new student in the list 	

2.View all Students 
	is used to display all the student list

3.Search Student by ID
	this is a search operation that is performed to search a student by roll number and then details are displayed

4.Update Student Marks
	this is th function used to update the marks of the particular student

5.Delete Student
	this is the function that is used to delete a student by his/her id

these are the operations we perform in the project

*/

public class Student {
    private int rollno;
    private String name;
    private int marks;

    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        System.out.println("❤️ Student added Sucessfully");
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
    }

}