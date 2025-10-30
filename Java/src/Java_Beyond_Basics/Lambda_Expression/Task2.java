package Java_Beyond_Basics.Lambda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee {
    int id, age;
    String name, gender, designation;

    public Employee(int id, int age, String name, String gender, String designation) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", designation="
                + designation + "]";
    }

}

public class Task2 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, 25, "Alice", "Female", "Developer"),
                new Employee(2, 30, "Bob", "Male", "Manager"),
                new Employee(3, 28, "Charlie", "Male", "Tester"),
                new Employee(4, 35, "Diana", "Female", "Developer"),
                new Employee(5, 32, "Ethan", "Male", "Manager"));
        Function<List<Employee>, List<List<Employee>>> task = (list) -> {
            List<Employee> onlyMales = new ArrayList<>();
            List<Employee> ageabove_28 = new ArrayList<>();
            for (Employee employee : list) {
                if (employee.getGender().equals("Male"))
                    onlyMales.add(employee);
                if (employee.getAge() > 28) {
                    ageabove_28.add(employee);
                }
            }

            // List<List<Employee>> t2 = new ArrayList<>();
            // t2.add(onlyMales);
            // t2.add(ageabove_28);
            // return t2;
            return List.of(onlyMales, ageabove_28);

        };
        List<List<Employee>> t2 = task.apply(employees);

        System.out.println("\n\n===============All male Employees================");
        for (Employee list2 : t2.get(0)) {
            System.out.println(list2);
        }

        System.out.println("\n\n=============All Employees above 25================");
        for (Employee list2 : t2.get(1)) {
            System.out.println(list2);
        }
    }
}
