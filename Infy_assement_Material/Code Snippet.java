import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;

class Q1 {
    public static void main(String[] args) {
        int n = 7;
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
// 2.

// Leap Year Check

class Q2 {
    public static void main(String[] args) {
        int year = 2024;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}
// 3.

// Largest of Three

class Q3 {
    public static void main(String[] args) {
        int a = 5, b = 8, c = 3;
        if (a > b && a > c)
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}

// 4.Switch Without Break

class Q4 {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
        }
    }
}

// Post vs Pre Increment

class Q5 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
    }
}

// String Equality

class Q6 {
    public static void main(String[] args) {
        String s1 = new String("Hi");
        String s2 = new String("Hi");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

// Array Index Error

class Q7 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(arr[3]);
    }
}

// Null Reference

class Student {
    String name;
}

class Q8 {
    public static void main(String[] args) {
        Student s = null;
        System.out.println(s.name);
    }
}
// Static Variable

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

class Q9 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        System.out.println(Counter.count);
    }
}

// Final Variable

class Q10 {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // compile error
    }
}

// Infinite Loop

class Q11 {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Hi");
            break;
        }
    }
}

// Break vs Continue

class Q12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue;
            System.out.print(i + " ");
        }
    }
}

// Method Overloading

class Add {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}

class Q13 {
    public static void main(String[] args) {
        Add obj = new Add();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(2.5, 3.5));
    }
}

// Method Overriding

class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

class Q14 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}

// This Keyword

class Demo {
    int x;

    Demo(int x) {
        this.x = x;
    }
}

class Q15 {
    public static void main(String[] args) {
        Demo d = new Demo(10);
        System.out.println(d.x);
    }
}

// Wrapper Conversion

class Q16 {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a; // autobox
        int b = obj; // unbox
        System.out.println(a + " " + obj + " " + b);
    }
}
// Try-Catch

class Q17 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

// Finally Block

class Q18 {
    public static void main(String[] args) {
        try {
            int x = 10 / 2;
        } finally {
            System.out.println("Always executes");
        }
    }
}

// Custom Exception

class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class Q19 {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18)
                throw new AgeException("Too young");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// Abstract Class

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}

class Q20 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

// 21. Interface

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class Q21 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

// String Builder

class Q22 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" Java");
        System.out.println(sb);
    }
}

// String Palindrome

class Q23 {
    public static void main(String[] args) {
        String s = "madam", rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        System.out.println(s.equals(rev));
    }
}

// Array Reverse

class Q24 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}
// Factorial

class Q25 {
    public static void main(String[] args) {
        int n = 5, fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println(fact);
    }
}
// . Fibonacci

class Q26 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

// Linear Search

class Q27 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30 };
        int key = 20, found = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                found = i;
        System.out.println(found);
    }
}

// Binary Search

class Q28 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9 };
        int key = 7, l = 0, r = arr.length - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                break;
            }
            if (arr[mid] < key)
                l = mid + 1;
            else
                r = mid - 1;
        }
    }
}

// Bubble Sort

class Q29 {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2 };
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        for (int x : arr)
            System.out.print(x + " ");
    }
}

// ArrayList

class Q30 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        for (String s : list)
            System.out.print(s + " ");
    }
}

class Q31 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map.get(2));
    }
}

class Q32 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
    }
}

class Q33 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        System.out.println(q.remove());
    }
}

class Person {
    Person() {
        System.out.println("No-arg");
    }

    Person(String name) {
        System.out.println(name);
    }
}

class Q34 {
    public static void main(String[] args) {
        new Person();
        new Person("John");
    }
}

class Aa {
    Aa() {
        System.out.println("A");
    }
}

class Bb extends Aa {
    Bb() {
        System.out.println("B");
    }
}

class Q35 {
    public static void main(String[] args) {
        new Bb();
    }
}

class Car {
}

class Q36 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c);
    }
}

final class X {
}
// class Y extends X {} // error

class Q38 {
    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}

class Q39 {
    static void sum(int... nums) {
        int s = 0;
        for (int n : nums)
            s += n;
        System.out.println(s);
    }

    public static void main(String[] args) {
        sum(1, 2, 3);
    }
}

class Q40 {
    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = "Hi";
        System.out.println(s1 == s2);
    }
}
