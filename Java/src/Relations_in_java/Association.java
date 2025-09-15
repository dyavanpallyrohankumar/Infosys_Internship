package Relations_in_java;

// Association means two classes are connected to eachother ,but both can exist independently

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class Library {
    String libraryname;

    public Library(String libraryname) {
        this.libraryname = libraryname;
    }
}

public class Association {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi");
        Library l1 = new Library("CIty lib");
        System.out.println(s1.name + " is associated with " + l1.libraryname);
    }
}
