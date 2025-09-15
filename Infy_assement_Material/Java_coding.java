// Intern-Level Java Coding Practice Solutions (50 Programs)
// ________________________________________
// 1. Java Fundamentals & Control Structures (7 Qs)
// 1. Even or Odd
public class Q1 {
    public static void main(String[] args) {
        int n = 7;
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// 2. Leap Year
public class Q2 {
    public static void main(String[] args) {
        int year = 2024;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}

// 3. Largest of three numbers
public class Q3 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        if (a >= b && a >= c)
            System.out.println(a);
        else if (b >= a && b >= c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}

// 4. Calculator (switch-case)
public class Q4 {
    public static void main(String[] args) {
        int a = 8, b = 4;
        char op = '+';
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(b != 0 ? a / b : "Divide by zero");
                break;
        }
    }
}

// 5. Swap numbers
public class Q5 {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        // with temp
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
        // without temp
        a = 5;
        b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}

// 6. Positive, Negative or Zero
public class Q6 {
    public static void main(String[] args) {
        int n = -3;
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}

// 7. Grade of student
public class Q7 {
    public static void main(String[] args) {
        int marks = 82;
        if (marks >= 90)
            System.out.println("A");
        else if (marks >= 75)
            System.out.println("B");
        else if (marks >= 50)
            System.out.println("C");
        else
            System.out.println("Fail");
    }
}

// ________________________________________
// 2. Loops, Arrays & Patterns (10 Qs)
// 8. Fibonacci series
public class Q8 {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

// 9. Factorial
public class Q9 {
    public static void main(String[] args) {
        int n = 5, f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        System.out.println(f);
    }
}

// 10. Prime numbers 1-100
public class Q10 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            boolean prime = true;
            for (int i = 2; i <= n / 2; i++)
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            if (prime)
                System.out.print(n + " ");
        }
    }
}

// 11. Multiplication table
public class Q11 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}

// 12. Triangle pattern
public class Q12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

// 13. Inverted pyramid
public class Q13 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

// 14. Sum of array elements
public class Q14 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 }, sum = 0;
        for (int x : arr)
            sum += x;
        System.out.println(sum);
    }
}

// 15. Largest and smallest in array
public class Q15 {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 7 };
        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("Max=" + max + " Min=" + min);
    }
}

// 16. Reverse array
public class Q16 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

// 17. Check if array is sorted
public class Q17 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        System.out.println(sorted ? "Sorted" : "Not Sorted");
    }
}

// ________________________________________
// 3. Methods (5 Qs)
// 18. Palindrome number
public class Q18 {
    static boolean isPal(int n) {
        int r = 0, temp = n;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return temp == r;
    }

    public static void main(String[] args) {
        System.out.println(isPal(121));
    }
}

// 19. Armstrong number
public class Q19 {
    static boolean isArm(int n) {
        int sum = 0, temp = n;
        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        System.out.println(isArm(153));
    }
}

// 20. Reverse string
public class Q20 {
    static String rev(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--)
            r += s.charAt(i);
        return r;
    }

    public static void main(String[] args) {
        System.out.println(rev("hello"));
    }
}

// 21. Overloaded calculator
public class Q21 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 7));
        System.out.println(add(2.5, 3.5));
    }
}

// 22. GCD of two numbers
public class Q22 {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
    }
}

// ________________________________________
// 4. OOP Concepts (9 Qs)
// 23. Student class
class Student {
    int id;
    String name;
    int marks;

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class Q23 {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "A";
        s.marks = 90;
        s.display();
    }
}

// 24. Employee class with constructor
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Q24 {
    public static void main(String[] args) {
        System.out.println(new Employee(1, "Bob"));
    }
}

// 25. Aggregation (Department has Employees)
class Emp {
    String name;

    Emp(String n) {
        name = n;
    }
}

class Dept {
    String dname;
    Emp[] e;

    Dept(String d, Emp[] e) {
        dname = d;
        this.e = e;
    }
}

public class Q25 {
    public static void main(String[] a) {
        Emp e1 = new Emp("X");
        Emp e2 = new Emp("Y");
        Dept d = new Dept("CS", new Emp[] { e1, e2 });
        System.out.println(d.dname + " dept has " + d.e.length + " employees");
    }
}

// 26. Association (Library and Book)
class Book {
    String title;

    Book(String t) {
        title = t;
    }
}

class Library {
    Book b;

    Library(Book b) {
        this.b = b;
    }
}

public class Q26 {
    public static void main(String[] args) {
        Book b = new Book("Java");
        Library l = new Library(b);
        System.out.println("Library has book " + l.b.title);
    }
}

// 27. Inheritance
class Person {
    String name;
}

class Emp2 extends Person {
    double sal;
}

class Manager extends Emp2 {
    String dept;
}

public class Q27 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Raj";
        m.sal = 5000;
        m.dept = "IT";
        System.out.println(m.name + " " + m.sal + " " + m.dept);
    }
}

// 28. Method overriding
class Animal {
    void sound() {
        System.out.println("Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class Q28 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

// 29. Method overloading
class MathOp {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Q29 {
    public static void main(String[] a) {
        MathOp m = new MathOp();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(2.5, 3.5));
    }
}

// 30. Static
class Counter {
    static int c = 0;

    Counter() {
        c++;
    }

    static void show() {
        System.out.println(c);
    }
}

public class Q30 {
    public static void main(String[] a) {
        new Counter();
        new Counter();
        Counter.show();
    }
}

// 31. this keyword
class Demo {
    int x;

    Demo(int x) {
        this.x = x;
    }
}

public class Q31 {
    public static void main(String[] a) {
        Demo d = new Demo(5);
        System.out.println(d.x);
    }
}

// ________________________________________
// 5. Strings & Wrappers (5 Qs)
// 32. Count vowels and consonants
public class Q32 {
    public static void main(String[] args) {
        String s = "hello";
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0)
                v++;
            else if (Character.isLetter(ch))
                c++;
        }
        System.out.println("Vowels=" + v + " Consonants=" + c);
    }
}

// 33. Palindrome string
public class Q33 {
    public static void main(String[] args) {
        String s = "madam", r = "";
        for (int i = s.length() - 1; i >= 0; i--)
            r += s.charAt(i);
        System.out.println(s.equals(r));
    }
}

// 34. Remove duplicates
public class Q34 {
    public static void main(String[] args) {
        String s = "banana", r = "";
        for (int i = 0; i < s.length(); i++)
            if (r.indexOf(s.charAt(i)) == -1)
                r += s.charAt(i);
        System.out.println(r);
    }
}

// 35. Uppercase without toUpperCase()
public class Q35 {
    public static void main(String[] args) {
        String s = "hello", r = "";
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                r += (char) (ch - 32);
            else
                r += ch;
        }
        System.out.println(r);
    }
}

// 36. Wrapper class
public class Q36 {
    public static void main(String[] args) {
        int x = 5;
        Integer obj = Integer.valueOf(x);
        int y = obj.intValue();
        System.out.println(x + " " + obj + " " + y);
    }
}

// ________________________________________
// 6. Exception Handling & Packages (4 Qs)
// 37. Divide by zero
public class Q37 {
    public static void main(String[] a) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

// 38. Custom exception
class AgeException extends Exception {
    AgeException(String m) {
        super(m);
    }
}

public class Q38 {
    public static void main(String[] a) {
        int age = 15;
        try {
            if (age < 18)
                throw new AgeException("Invalid Age");
        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}

// 39. try-catch-finally
public class Q39 {
    public static void main(String[] a) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally executed");
        }
    }
}

// 40. Packages (outline)
// In file com/student/Student.java
// package com.student; public class Student{public void
// show(){System.out.println("Student class");}}
// In file com/course/Course.java
// package com.course; public class Course{public void
// display(){System.out.println("Course class");}}
// In main file
// import com.student.*; import com.course.*; public class Q40{public static
// void main(String[] a){new Student().show();new Course().display();}}
// ________________________________________
// 7. Data Structures (5 Qs)
// 41. Stack using array
class Stack {
    int arr[] = new int[5];
    int top = -1;

    void push(int x) {
        if (top < 4)
            arr[++top] = x;
    }

    void pop() {
        if (top >= 0)
            top--;
    }

    void display() {
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");
    }
}

public class Q41 {
    public static void main(String[] a) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.display();
    }
}

// 42. Queue using array
class Queue {
    int arr[] = new int[5];
    int f = 0, r = -1;

    void enqueue(int x) {
        if (r < 4)
            arr[++r] = x;
    }

    void dequeue() {
        if (f <= r)
            f++;
    }

    void display() {
        for (int i = f; i <= r; i++)
            System.out.print(arr[i] + " ");
    }
}

public class Q42 {
    public static void main(String[] a) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.display();
    }
}

// 43. Stack push/pop/peek
public class Q43 {
    public static void main(String[] a) {
        int[] stack = new int[5];
        int top = -1;
        stack[++top] = 10;
        stack[++top] = 20; // push
        System.out.println(stack[top--]); // pop
        System.out.println(stack[top]); // peek
    }
}

// 44. ArrayList
// import java.util.ArrayList;
public class Q44 {
    public static void main(String[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int x : list)
            System.out.println(x);
    }
}

// 45. HashMap
// import java.util.HashMap;
public class Q45 {
    public static void main(String[] a) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        System.out.println(map.get(1));
    }
}

// ________________________________________
// 8. Algorithms (5 Qs)
// 46. Linear search
public class Q46 {
    public static void main(String[] a) {
        int arr[] = { 2, 4, 6, 8 }, key = 6, pos = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) {
                pos = i;
                break;
            }
        System.out.println(pos);
    }
}

// 47. Binary search
public class Q47 {
    public static void main(String[] a) {
        int arr[] = { 1, 3, 5, 7, 9 }, key = 7, l = 0, r = arr.length - 1, pos = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == key) {
                pos = m;
                break;
            } else if (arr[m] < key)
                l = m + 1;
            else
                r = m - 1;
        }
        System.out.println(pos);
    }
}

// 48. Bubble sort
public class Q48 {
    public static void main(String[] a) {
        int arr[] = { 5, 1, 4, 2 };
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        for (int x : arr)
            System.out.print(x + " ");
    }
}

// 49. Selection sort
public class Q49 {
    public static void main(String[] a) {
        int arr[] = { 5, 2, 9, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
        for (int x : arr)
            System.out.print(x + " ");
    }
}

// 50. Merge sort
public class Q50 {
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int L[] = new int[n1], R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] a) {
        int arr[] = { 5, 2, 4, 1, 3 };
        sort(arr, 0, arr.length - 1);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
