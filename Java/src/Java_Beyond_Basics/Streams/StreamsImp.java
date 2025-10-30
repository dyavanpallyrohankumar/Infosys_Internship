package Java_Beyond_Basics.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public String toString() {
        return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", designation="
                + designation + "]";
    }

}

public class StreamsImp {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        // for (Integer integer : numbers) {
        // if (integer % 2 == 0)
        // evennumbers.add(integer);
        // }
        // System.out.println(evennumbers);

        List<Integer> evennumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());

        System.out.println(evennumbers);
        List<Employee> employees = List.of(
                new Employee(1, 25, "Alice", "Female", "Developer"),
                new Employee(2, 30, "Bob", "Male", "Manager"),
                new Employee(3, 28, "Charlie", "Male", "Tester"),
                new Employee(4, 35, "Diana", "Female", "Developer"),
                new Employee(5, 32, "Ethan", "Male", "Manager"));

        List<Employee> filterByA = employees.stream()
                .filter(emp -> emp.getName().startsWith("A"))
                .collect(Collectors.toList());
        List<Employee> filterByAge = employees.stream()
                .filter(emp -> emp.getAge() > 28)
                .collect(Collectors.toList());
        System.out.println(filterByAge);
    }

}
