
## 🧾 **What is Java?**

**Java** is a **high-level**, **object-oriented**, **platform-independent** programming language developed by **Sun Microsystems** (now owned by Oracle Corporation). It is designed to be simple, secure, and robust, making it one of the most widely used programming languages in the world.

---

### 🔑 **Definition**
> Java is a general-purpose, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.

---

### 🧪 **Key Characteristics of Java**

| Feature | Description |
|--------|-------------|
| **High-Level Language** | Abstracts away hardware details, easy to read and write. |
| **Object-Oriented** | Based on real-world entities using classes and objects. |
| **Platform Independent** | Java code runs on any device with a JVM (Java Virtual Machine). |
| **Compiled & Interpreted** | Java source code is compiled into bytecode, which is interpreted by the JVM. |
| **Secure** | No pointers, strong memory management, and built-in security features. |
| **Robust** | Strong error handling and garbage collection. |
| **Multithreaded** | Supports concurrent execution of two or more threads. |
| **Distributed** | Supports networked applications and remote method invocation (RMI). |

---

### 🧱 **Java Architecture Overview**

1. **Source Code (.java)** → written by the programmer.
```
Example of .java file

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

```
2. **Compiler (javac)** → converts `.java` files to **bytecode (.class)**.
```
Example of .Class File


Êþº¾   A "   remaning/HelloWorld   java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lremaning/HelloWorld; main ([Ljava/lang/String;)V	     java/lang/System   out Ljava/io/PrintStream;  
Hello, World!
     java/io/PrintStream    println (Ljava/lang/String;)V args [Ljava/lang/String; 
SourceFile HelloWorld.java !                /     *· ±    
        
         
   	        7     	² ¶ ±    
   
       
       	           !
```
3. **JVM (Java Virtual Machine)** → executes the bytecode on any platform.

This architecture enables **Write Once, Run Anywhere (WORA)**.

---

### 🧰 **Java Components**

- **JDK (Java Development Kit)**: Tools for developing Java applications (includes compiler, debugger, etc.).
- **JRE (Java Runtime Environment)**: Environment to run Java applications (includes JVM + libraries).
- **JVM (Java Virtual Machine)**: Executes Java bytecode and provides platform independence.

---

### 📌 **Why Use Java?**

- **Cross-platform compatibility**
- **Strong community support**
- **Rich API and libraries**
- **Used in Android development, enterprise applications, web apps, and more**

---

### 🧑‍💻 Example: Hello World in Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- `public class HelloWorld`: Defines a class.
- `main` method: Entry point of the program.
- `System.out.println`: Prints output to the console.

---

## 🕰️ **Java History**

### 1. **Origin**
- **Java** was developed by **James Gosling** and his team at **Sun Microsystems** in **1991**.
- Originally called **Oak**, named after an oak tree outside Gosling’s office.
- Later renamed to **Java**, inspired by Java coffee.

### 2. **Initial Purpose**
- Designed for **embedded systems** and **interactive television**, but it was too advanced for the digital cable TV industry at the time.
- Eventually evolved into a **general-purpose programming language**.

### 3. **Major Milestones**
| Year | Event |
|------|-------|
| 1995 | Java officially released by Sun Microsystems |
| 1996 | First public release: **JDK 1.0** |
| 2006 | Sun released Java as **open-source** under the GNU GPL |
| 2009 | **Oracle Corporation** acquired Sun Microsystems |
| 2014+ | Introduction of **Java 8** with major features like **Lambda Expressions** |
| 2017+ | Shift to **six-month release cycle** for faster updates |

---

## 🌟 **Key Features of Java**

Java is known for its **robustness, portability, and security**. Here are its core features:

### 1. **Simple**
- Easy to learn if you're familiar with C/C++.
- No complex features like pointers or operator overloading.

### 2. **Object-Oriented**
- Everything in Java is an object (except primitive types).
- Supports concepts like **inheritance, encapsulation, polymorphism, abstraction**.

### 3. **Platform Independent**
- Java code is compiled into **bytecode** (.class files), which can run on any system with a **Java Virtual Machine (JVM)**.
- “**Write Once, Run Anywhere**” (WORA) philosophy.

### 4. **Secure**
- No direct memory access (no pointers).
- Bytecode verification and runtime security checks.
- Supports **cryptography, secure communication, and authentication**.

### 5. **Robust**
- Strong memory management.
- Exception handling and garbage collection.
- Type checking at compile and runtime.

### 6. **Multithreaded**
- Built-in support for **multithreading** (running multiple threads simultaneously).
- Useful for high-performance applications like games or servers.

### 7. **Architecture Neutral**
- Bytecode is not dependent on any architecture.
- Ensures consistent behavior across platforms.

### 8. **Portable**
- Java programs can be easily moved from one system to another.
- No dependency on system-specific features.

### 9. **High Performance**
- Although interpreted, Java uses **Just-In-Time (JIT)** compilers to improve performance.

### 10. **Distributed**
- Java has built-in support for **networking** using libraries like `java.net`.
- Facilitates development of distributed applications.

### 11. **Dynamic**
- Java programs carry runtime information that can be used to verify and resolve accesses to objects.

<!-- --- -->

<!-- ## 📝 Summary Table

| Feature | Description |
|--------|-------------|
| Simple | Easy syntax, no pointers |
| Object-Oriented | Based on OOP principles |
| Platform Independent | Bytecode runs on JVM |
| Secure | No memory corruption, built-in security |
| Robust | Strong error handling |
| Multithreaded | Supports concurrent execution |
| Architecture Neutral | Bytecode is universal |
| Portable | Easily transferable across platforms |
| High Performance | JIT compiler boosts speed |
| Distributed | Supports networked applications |
| Dynamic | Runtime adaptability |
 -->


---

## ⚙️ **JVM, JRE, and JDK**

---

### 🔵 **1. JVM – Java Virtual Machine**

#### ✅ **Definition:**
The **Java Virtual Machine (JVM)** is an abstract machine that enables your computer to run Java programs. It interprets the **compiled bytecode** and executes it.

#### 🔍 **Key Responsibilities:**
- Converts **bytecode** into **machine code**.
- Provides **platform independence**.
- Handles **memory management**, **garbage collection**, and **security**.
- Manages **runtime environment** for Java applications.

#### 📌 **Important Points:**
- JVM is **platform-dependent** (different for Windows, Linux, etc.).
- It is part of the **JRE**.
- It does **not compile** Java code — it **executes** it.

---

### 🟠 **2. JRE – Java Runtime Environment**

#### ✅ **Definition:**
The **Java Runtime Environment (JRE)** provides the libraries, JVM, and other components to **run** Java applications.

#### 🔍 **Includes:**
- **JVM**
- **Core Java libraries**
- **Java class loader**
- **Runtime libraries**

#### 📌 **Important Points:**
- JRE is used to **run** Java programs, not to develop them.
- If you're only running Java applications (not writing code), you only need the JRE.

---

### 🟢 **3. JDK – Java Development Kit**

#### ✅ **Definition:**
The **Java Development Kit (JDK)** is a full-featured software development kit used to **develop** Java applications.

#### 🔍 **Includes:**
- **JRE** (which includes JVM)
- **Java Compiler (`javac`)**
- **Debugger**
- **JavaDoc**
- **Tools for packaging (e.g., JAR files)**

#### 📌 **Important Points:**
- JDK is required for **writing, compiling, and debugging** Java programs.
- It is the **superset** of JRE.

---

<!-- ## 🧠 **Summary Table**

| Component | Purpose | Includes |
|----------|---------|----------|
| **JVM** | Executes bytecode | Part of JRE |
| **JRE** | Runs Java programs | JVM + Libraries |
| **JDK** | Develops Java programs | JRE + Compiler + Tools |

--- -->

## 🔁 **Workflow Overview**

```plaintext
Java Source Code (.java)
        ↓
Java Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM (via JRE)
        ↓
Program Execution
```

---

## 🧾 **Java Program Compilation Process**

Java follows a **two-step compilation and execution process** that makes it **platform-independent**. Here's how it works:

---

### 🔄 **Step-by-Step Process**

#### ✅ **1. Writing the Source Code**
- You write your Java program in a `.java` file.
- Example:
  ```java
  public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
  ```

#### ✅ **2. Compilation (javac)**
- The Java compiler (`javac`) compiles the `.java` file into **bytecode**, which is stored in a `.class` file.
- Bytecode is a **platform-independent** intermediate representation.
- Command:
  ```bash
  javac HelloWorld.java
  ```
- Output:
  ```
  HelloWorld.class
  ```

#### ✅ **3. Execution (java)**
- The **Java Virtual Machine (JVM)** reads the `.class` file and executes the bytecode.
- JVM converts bytecode into **machine code** specific to the operating system.
- Command:
  ```bash
  java HelloWorld
  ```

---

<!-- ### 🧠 **Key Concepts**

| Term | Description |
|------|-------------|
| **Source Code** | Human-readable Java code written in `.java` files |
| **Compiler (javac)** | Converts source code to bytecode |
| **Bytecode** | Intermediate code stored in `.class` files |
| **JVM** | Executes bytecode on any platform |
| **JRE** | Contains JVM and libraries needed to run Java programs |
| **JDK** | Contains JRE + tools to develop Java programs |

--- -->

### 📌 **Why This Process Matters**
- Ensures **platform independence**: Bytecode can run on any system with a JVM.
- Improves **security**: Bytecode verification before execution.
- Enables **performance optimization**: JVM uses **Just-In-Time (JIT)** compilation to speed up execution.

---

### 🔁 **Visual Summary**

```plaintext
HelloWorld.java
     ↓ (javac)
HelloWorld.class (Bytecode)
     ↓ (JVM)
Machine Code → Output: Hello, World!
```



---

# 🗒️ **Comments in Java**

### ✅ **What are Comments?**
**Comments** are lines in the code that are **ignored by the compiler**. They are used to:
- Explain code logic
- Improve readability
- Leave notes for future reference
- Temporarily disable code during debugging

---

## 🟩 **1. Single-line Comment**

### 🔹 **Syntax:**
```java
// This is a single-line comment
```

### 🔹 **Usage:**
- Used for brief explanations.
- Placed on its own line or at the end of a code line.

### 🔹 **Example:**
```java
int x = 10; // Assigning value to x
```

---

## 🟦 **2. Multi-line Comment**

### 🔹 **Syntax:**
```java
/* 
   This is a multi-line comment.
   It can span multiple lines.
*/
```

### 🔹 **Usage:**
- Used for longer descriptions or documentation.
- Ideal for commenting out blocks of code during testing.

### 🔹 **Example:**
```java
/*
This program prints Hello World.
Author: Rohankumar
Date: 23-Sep-2025
*/
System.out.println("Hello, World!");
```

---



# 🧾 **Data Types in Java**

### ✅ **What are Data Types?**
**Data types** specify the type of data that a variable can hold in Java. They help the compiler understand how much memory to allocate and what operations can be performed on the data.

Java has two main categories of data types:

---

## 🟩 **1. Primitive Data Types**

These are the **basic building blocks** of data manipulation in Java. There are **8 primitive types**, each with a specific size and range.

| Type     | Size     | Description                          | Example         |
|----------|----------|--------------------------------------|-----------------|
| `byte`   | 1 byte   | Small integer (-128 to 127)          | `byte a = 100;` |
| `short`  | 2 bytes  | Larger integer (-32,768 to 32,767)   | `short b = 2000;` |
| `int`    | 4 bytes  | Common integer (-2^31 to 2^31-1)     | `int c = 50000;` |
| `long`   | 8 bytes  | Very large integer                   | `long d = 100000L;` |
| `float`  | 4 bytes  | Decimal number (single precision)    | `float e = 5.75f;` |
| `double` | 8 bytes  | Decimal number (double precision)    | `double f = 19.99;` |
| `char`   | 2 bytes  | Single character (Unicode)           | `char g = 'A';` |
| `boolean`| 1 bit    | True or false                        | `boolean h = true;` |

---

## 🟦 **2. Non-Primitive (Reference) Data Types**
<!-- 
These are more complex and are used to store **objects** and **arrays**.

### 🔹 Examples:
- **String**: Represents a sequence of characters.
  ```java
  String name = "Rohankumar";
  ```
- **Array**: Stores multiple values of the same type.
  ```java
  int[] numbers = {1, 2, 3, 4};
  ```
- **Class**: Blueprint for creating objects.
  ```java
  class Student {
      int id;
      String name;
  }
  ```
- **Interface, Enum, etc.**

### 🔍 Characteristics:
- Can be **null**
- Stored in **heap memory**
- Can be **custom-defined** by the programmer

---

## 🔄 **Type Conversion in Java**

### 🔸 **Implicit Type Conversion (Widening)**
- Automatically done by Java when converting a smaller type to a larger type.
  ```java
  int a = 10;
  double b = a; // int to double
  ```

### 🔸 **Explicit Type Conversion (Narrowing)**
- Manual conversion using casting.
  ```java
  double x = 10.5;
  int y = (int) x; // double to int
  ```

---

## 🧠 **Quick Summary**

| Category         | Types Included                          |
|------------------|------------------------------------------|
| **Primitive**     | byte, short, int, long, float, double, char, boolean |
| **Non-Primitive** | String, Array, Class, Interface, Enum   |

---

Would you like a **diagram** showing the hierarchy of data types or move on to the next topic like **Type Conversion** or **Operators**? -->




### ✅ **Definition:**
**Non-primitive data types**, also known as **reference types**, are types that refer to objects and not the actual data stored in memory. Unlike primitive types (like `int`, `char`, etc.), non-primitive types are created by the programmer or provided by Java libraries.

---

## 🟦 **Key Characteristics**
- Can store **multiple values** or **complex data**.
- Can be **null** (i.e., not pointing to any object).
- Stored in **heap memory**.
- Support **methods and properties**.
- Can be **custom-defined** using classes and interfaces.

---

## 🔹 **Types of Non-Primitive Data Types**

### 1. **String**
- Represents a sequence of characters.
- Java provides the `String` class in `java.lang` package.
- Example:
  ```java
  String name = "Rohankumar";
  System.out.println(name.length()); // Outputs: 10
  ```

### 2. **Array**
- Stores multiple values of the same type.
- Can be single-dimensional or multi-dimensional.
- Example:
  ```java
  int[] numbers = {1, 2, 3, 4};
  String[] names = {"Java", "Python", "C++"};
  ```

### 3. **Class**
- A blueprint for creating objects.
- Contains fields (variables) and methods (functions).
- Example:
  ```java
  class Student {
      int id;
      String name;
  }
  ```

### 4. **Interface**
- A reference type similar to a class but only contains abstract methods.
- Used to achieve **abstraction** and **multiple inheritance**.
- Example:
  ```java
  interface Animal {
      void sound();
  }
  ```

### 5. **Enum**
- A special type used to define a collection of constants.
- Example:
  ```java
  enum Day { MONDAY, TUESDAY, WEDNESDAY }
  ```

### 6. **Wrapper Classes**
- Used to convert primitive types into objects.
- Example:
  ```java
  Integer age = 25; // int wrapped into Integer
  ```

---

## 🧠 **Comparison: Primitive vs Non-Primitive**

| Feature               | Primitive Data Types | Non-Primitive Data Types |
|----------------------|----------------------|---------------------------|
| Memory Allocation     | Stack                | Heap                      |
| Can be null           | No                   | Yes                       |
| Methods available     | No                   | Yes                       |
| Custom creation       | No                   | Yes (via class/interface) |
| Examples              | int, char, boolean   | String, Array, Class      |

---

## 📌 **Important Notes**
- All non-primitive types are **objects** in Java.
- They are **passed by reference**, not by value.
- Java provides many built-in non-primitive types, and you can create your own using **classes and interfaces**.


---

## 🧾 **Variables in Java**

### ✅ **Definition:**
A **variable** in Java is a **named memory location** used to store data that can be changed during program execution. It acts as a container for values.

---

## 🟩 **Types of Variables in Java**

Java supports **three main types of variables** based on their scope and lifetime:

### 1. **Local Variables**
- Declared inside a method, constructor, or block.
- Accessible only within the method or block.
- Must be initialized before use.

```java
public void show() {
    int x = 10; // local variable
    System.out.println(x);
}
```

### 2. **Instance Variables**
- Declared inside a class but **outside any method**.
- Each object of the class has its own copy.
- Initialized to default values if not explicitly set.

```java
class Student {
    int age; // instance variable
}
```

### 3. **Static Variables (Class Variables)**
- Declared using the `static` keyword.
- Shared among all instances of the class.
- Memory allocated only once during class loading.

```java
class Student {
    static String schoolName = "ABC School"; // static variable
}
```

---

## 🟦 **Variable Declaration and Initialization**

### 🔹 **Syntax:**
```java
dataType variableName;           // Declaration
variableName = value;            // Initialization
dataType variableName = value;  // Declaration + Initialization
```

### 🔹 **Example:**
```java
int age = 25;
String name = "Rohankumar";
```

---

## 🔸 **Rules for Naming Variables**
- Must begin with a **letter**, **underscore (_)**, or **dollar sign ($)**.
- Cannot start with a digit.
- Cannot use **Java reserved keywords** (e.g., `int`, `class`, `static`).
- Case-sensitive (`age` and `Age` are different).
- Use meaningful names for readability.
- Must start with a letter, _, or $.
- Cannot start with a digit.
- Cannot use Java reserved keywords.
- Case-sensitive (age ≠ Age).

---

## 🧠 **Default Values of Instance/Static Variables**

| Data Type | Default Value |
|-----------|---------------|
| `int`     | `0`           |
| `float`   | `0.0f`        |
| `boolean` | `false`       |
| `char`    | `'\u0000'`    |
| `String`  | `null`        |

> Note: **Local variables do not get default values** — they must be initialized before use.

---

## 📌 **Best Practices**
- Use **camelCase** for variable names (`studentName`, `totalMarks`).
- Keep variable names **short but descriptive**.
- Avoid using single-letter names except in loops (`i`, `j`, `k`).

---
Here’s a detailed explanation for your notes on **Type Conversion in Java**, including **Implicit** and **Explicit Type Conversion**:

---

## 🔄 **Type Conversion in Java**

### ✅ **Definition:**
**Type conversion** refers to changing the data type of a variable or expression from one type to another. Java supports two types of conversions:

1. **Implicit Type Conversion (Widening)**
2. **Explicit Type Conversion (Narrowing)**

---

## 🟩 **1. Implicit Type Conversion (Widening Conversion)**

### 🔹 **What is it?**
- Automatically performed by the **Java compiler**.
- Happens when converting a **smaller data type to a larger data type**.
- No data loss occurs.

### 🔹 **Example:**
```java
int a = 10;
double b = a; // int is converted to double automatically
System.out.println(b); // Output: 10.0
```

### 🔹 **Widening Order:**
```plaintext
byte → short → int → long → float → double
```

### 🔹 **Why is it safe?**
- Because the larger data type can accommodate all values of the smaller type.

---

## 🟦 **2. Explicit Type Conversion (Narrowing Conversion)**

### 🔹 **What is it?**
- Manually performed by the **programmer** using **type casting**.
- Happens when converting a **larger data type to a smaller data type**.
- May result in **data loss** or **precision loss**.

### 🔹 **Syntax:**
```java
dataType variableName = (targetType) value;
```

### 🔹 **Example:**
```java
double x = 10.75;
int y = (int) x; // double is explicitly cast to int
System.out.println(y); // Output: 10
```

### 🔹 **Why is it risky?**
- Because the smaller type may not be able to hold the full value of the larger type.

---

## 🧠 **Comparison Table**

| Feature                  | Implicit Conversion | Explicit Conversion |
|--------------------------|---------------------|---------------------|
| Also called              | Widening            | Narrowing           |
| Performed by             | Compiler            | Programmer          |
| Syntax                   | Automatic           | Manual (using cast) |
| Risk of data loss        | No                  | Yes                 |
| Example                  | `int → double`      | `double → int`      |

---

## 📌 **Best Practices**
- Prefer **implicit conversion** when possible.
- Use **explicit conversion** carefully, especially when dealing with floating-point to integer conversions.
- Always check for **possible data loss** when narrowing types.

---
Here’s a detailed explanation for your notes on **Scope of Variables** and **Local Variables in Java**:

---

## 🧾 **Scope of Variables in Java**

### ✅ **Definition:**
**Scope** refers to the **region of the program** where a variable is **accessible** or **visible**. In Java, the scope of a variable depends on **where it is declared**.

---

### 🔹 **Types of Variable Scope**

| Type              | Scope Description |
|-------------------|-------------------|
| **Local Variable** | Accessible only within the method/block where it is declared |
| **Instance Variable** | Accessible throughout the class (via object) |
| **Static Variable** | Accessible throughout the class (via class name) |

---

## 🟩 **Local Variables**

### ✅ **Definition:**
A **local variable** is declared **inside a method, constructor, or block** and is accessible **only within that method or block**.

### 🔹 **Key Characteristics:**
- **Must be initialized** before use.
- **Not accessible** outside the method/block.
- **Stored in stack memory**.
- **No default values** — must be explicitly assigned.

### 🔹 **Example:**
```java
public class Example {
    public void showMessage() {
        int count = 5; // local variable
        System.out.println("Count is: " + count);
    }
}
```

### 🔹 **Invalid Access Example:**
```java
public void anotherMethod() {
    // System.out.println(count); // Error: count is not visible here
}
```

---

### 🧠 **Important Notes:**
- Local variables are **temporary** and exist only during the execution of the method/block.
- They are **not accessible** by other methods or outside the block.
- You **cannot use access modifiers** (like `public`, `private`) with local variables.

<!-- ---

### 📌 **Best Practices:**
- Use **meaningful names** to describe the purpose of the variable.
- Keep the scope **as narrow as possible** to avoid unintended side effects.
- Always **initialize** local variables before use. -->

---
Here are the **types of operators in Java** (just the names as requested):

1. **Arithmetic Operators**  
2. **Relational Operators**  
3. **Logical Operators**  
4. **Bitwise Operators**  
5. **Unary Operators**  
6. **Ternary Operator**  
7. **Assignment Operators**  
8. **Comparison Operators** *(often grouped with relational)*  
9. **Shift Operators**  
10. **Instanceof Operator**  
11. **Type Cast Operator**


Here’s a detailed explanation for your notes on **Arithmetic Operators in Java**:

---

## ➕ **Arithmetic Operators in Java**

### ✅ **Definition:**
**Arithmetic operators** are used to perform **basic mathematical operations** on variables and values.

---

### 🔹 **List of Arithmetic Operators**

| Operator | Name           | Description                          | Example             |
|----------|----------------|--------------------------------------|---------------------|
| `+`      | Addition       | Adds two operands                    | `a + b`             |
| `-`      | Subtraction    | Subtracts second operand from first  | `a - b`             |
| `*`      | Multiplication | Multiplies two operands              | `a * b`             |
| `/`      | Division       | Divides first operand by second      | `a / b`             |
| `%`      | Modulus        | Returns remainder of division        | `a % b`             |

---

### 🔸 **Examples:**
```java
int a = 10;
int b = 3;

System.out.println(a + b); // Output: 13
System.out.println(a - b); // Output: 7
System.out.println(a * b); // Output: 30
System.out.println(a / b); // Output: 3 (integer division)
System.out.println(a % b); // Output: 1 (remainder)
```

> Note: If both operands are integers, division will return an integer result. Use `float` or `double` for decimal results.

---

### 🧠 **Important Notes:**
- Division by zero will cause a **runtime error** (`ArithmeticException`).
- The `%` operator is useful for checking **even/odd** numbers or **cyclic operations**.
- Arithmetic operators can be used with **primitive types** like `int`, `float`, `double`, etc.

<!-- --- -->

<!-- ### 📌 **Best Practices:**
- Use parentheses `()` to **control precedence** in complex expressions.
- Be cautious with **integer division** — it truncates the decimal part. -->

---



## 🔗 **Relational Operators in Java**

### ✅ **Definition:**
**Relational operators** are used to **compare two values or expressions**. They return a **boolean result**: either `true` or `false`.

---

### 🔹 **List of Relational Operators**

| Operator | Name                     | Description                                  | Example  |
| -------- | ------------------------ | -------------------------------------------- | -------- |
| `==`     | Equal to                 | Returns `true` if both operands are equal    | `a == b` |
| `!=`     | Not equal to             | Returns `true` if operands are not equal     | `a != b` |
| `>`      | Greater than             | Returns `true` if left is greater than right | `a > b`  |
| `<`      | Less than                | Returns `true` if left is less than right    | `a < b`  |
| `>=`     | Greater than or equal to | Returns `true` if left is ≥ right            | `a >= b` |
| `<=`     | Less than or equal to    | Returns `true` if left is ≤ right            | `a <= b` |

---

### 🔸 **Example:**
```java
int a = 10;
int b = 20;

System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a < b);   // true
System.out.println(a > b);   // false
System.out.println(a <= b);  // true
System.out.println(a >= b);  // false
```

---

### 🧠 **Key Points:**
- Relational operators are commonly used in **conditional statements** like `if`, `while`, and `for`.
- They work with **numeric types**, **characters**, and **boolean values**.
- For **object comparison**, use `.equals()` instead of `==`.



---

## 🔗 **Logical Operators in Java**

### ✅ **Definition:**
**Logical operators** are used to combine multiple **boolean expressions** or conditions. They return a **boolean result** (`true` or `false`) based on the logic applied.

---

### 🔹 **List of Logical Operators**

| Operator | Name        | Description                                    | Example             |
| -------- | ----------- | ---------------------------------------------- | ------------------- |
| `&&`     | Logical AND | Returns `true` if **both** conditions are true | `(a > 5 && b < 10)` |
| `        |             | `                                              | Logical OR          | Returns `true` if **at least one** condition is true | `(a > 5 |  | b < 10)` |
| `!`      | Logical NOT | Reverses the result of a condition             | `!(a > 5)`          |

---

### 🔸 **Examples:**
```java
int a = 7;
int b = 12;

System.out.println(a > 5 && b < 15); // true
System.out.println(a > 10 || b < 15); // true
System.out.println(!(a > 5)); // false
```

---

### 🧠 **Key Points:**
- Logical operators are commonly used in **conditional statements** like `if`, `while`, and `for`.
- They operate on **boolean expressions**.
- `&&` and `||` are **short-circuit operators**:
  - `&&` stops evaluating if the first condition is false.
  - `||` stops evaluating if the first condition is true.

---

<!-- ### 📌 **Best Practices:**
- Use parentheses `()` to group conditions for clarity.
- Avoid overly complex expressions — break them into smaller parts if needed.
- Understand short-circuit behavior to optimize performance and avoid errors.

--- -->


## ❓ **Ternary Operator in Java**

### ✅ **Definition:**
The **ternary operator** is a **shortcut for `if-else` statements**. It evaluates a condition and returns one of two values depending on whether the condition is `true` or `false`.

It is the **only conditional operator** that takes **three operands**, hence the name *ternary*.

---

### 🔹 **Syntax:**
```java
condition ? value_if_true : value_if_false;
```

---

### 🔹 **Example:**
```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;
System.out.println("Maximum is: " + max); // Output: Maximum is: 20
```

---

### 🔸 **Explanation:**
- If `a > b` is `true`, `max` will be assigned `a`.
- If `a > b` is `false`, `max` will be assigned `b`.

---

### 🧠 **Use Cases:**
- Simplifying short `if-else` conditions.
- Assigning values based on a condition.
- Making code more concise and readable.

---

### 📌 **Best Practices:**
- Use ternary operator for **simple conditions**.
- Avoid nesting ternary operators — it can make code hard to read.
- Prefer `if-else` for complex logic or multiple conditions.

