package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatientBase {
    private Integer id;
    private String name;
    private Integer age;

    public PatientBase(Integer id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PatientBase [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}

class ListMethodsDemo {
    public static void main(String[] args) {
        PatientBase p1 = new PatientBase(1, "rkjasdga", 74);
        PatientBase p3 = new PatientBase(3, "hello", 74);
        PatientBase p2 = new PatientBase(2, "byeee", 74);

        List<PatientBase> patients = new ArrayList<>();
        // Arrays.asList(p1,p2,p3);
        patients.addAll( Arrays.asList(p1,p2,p3));
        System.out.println(patients);
    }

}