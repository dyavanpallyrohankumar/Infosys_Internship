package Java_Beyond_Basics.Lambda_Expression;

import java.util.Comparator;

public class Sortings {

}

class sorting_by_name implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class sorting_by_age implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }

}

class sorting_by_dept implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }

}

class sorting_by_nameLength implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().length() - o2.getName().length();
    }

}