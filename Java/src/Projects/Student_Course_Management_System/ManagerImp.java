package Projects.Student_Course_Management_System;

import java.util.*;
import java.util.Map.Entry;

public class ManagerImp implements Manager {
    Map<Integer, Student> students = new HashMap<>();

    Set<Course> courses = new HashSet<>();

    @Override
    public void add_Student(int studentId, String name, String email) {
        students.putIfAbsent(studentId, new Student(name, email, studentId));
    }

    @Override
    public void add_Course(int courseId, String courseName, double credits) {
        courses.add(new Course(courseId, courseName, credits));
    }

    @Override
    public void remove_Student(int rid) {
        // for (Entry<Integer, Student> entry : students.entrySet()) {
        // if (rid == entry.getKey()) {
        students.remove(rid);
        // }
        // }
    }

    @Override
    public void remove_Course(int cid) {
        for (Course course : courses) {
            if (cid == course.getCourseId()) {
                courses.remove(course);
            }
        }
    }

    @Override
    public void display_Students() {
        for (Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Student ID:" + entry.getKey() + " Details: " + entry.getValue());
        }
    }

    @Override
    public void display_Student_by_ID(int Sid) {
        for (Entry<Integer, Student> entry : students.entrySet()) {
            if (entry.getKey() == Sid) {
                System.out.println("Student ID:" + entry.getKey() + " Details: " + entry.getValue());
            }
        }
    }

    @Override
    public void display_Courses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    @Override
    public void enrollStudents(int assignid, List<Integer> courseenrolled) {
        if (!students.containsKey(assignid)) {
            throw new IllegalArgumentException("Student not Found");
        }
        List<Course> settingcourses = new ArrayList<>();
        for (Integer integer : courseenrolled) {
            for (Course course : courses) {
                if (course.getCourseId() == integer) {
                    settingcourses.add(course);
                }
            }
        }
        students.get(assignid).setCoursesEnrolled(settingcourses);
    }

}
