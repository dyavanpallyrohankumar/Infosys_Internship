
# Java Basics

## 1. History & Features of Java

### History of Java
- **Developed by:** James Gosling and team at Sun Microsystems in **1995**.
- **Original name:** Oak, later renamed to Java.
- **Purpose:** Initially for embedded systems, evolved into a general-purpose language.

### Key Features
- **Simple**: Easy to learn.
- **Object-Oriented**: Promotes modular and reusable code.
- **Platform Independent**: Runs on any system with JVM.
- **Secure**: Built-in security features.
- **Robust**: Strong memory management and exception handling.
- **Multithreaded**: Supports concurrent execution.
- **Architecture Neutral**: Bytecode is architecture-independent.
- **Portable**: Runs on different platforms.
- **High Performance**: Uses JIT compiler.
- **Distributed**: Supports networked applications.
- **Dynamic**: Runtime information for verification.

## 2. JVM, JRE, JDK

### JVM (Java Virtual Machine)
- Runs Java bytecode.
- Handles memory, security, and execution.

### JRE (Java Runtime Environment)
- Contains JVM + libraries.
- Required to run Java programs.

### JDK (Java Development Kit)
- Contains JRE + development tools.
- Required to write and compile Java programs.

## 3. Java Program Structure

```java
package mypackage;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Components
- **Package**: Organizes classes.
- **Import**: Brings in external classes.
- **Class**: Blueprint for objects.
- **Main Method**: Entry point.
- **Statements**: Executable instructions.

## 4. Writing Your First Java Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### Steps
1. Save as `HelloWorld.java`
2. Compile: `javac HelloWorld.java`
3. Run: `java HelloWorld`

### Output
```
Hello, Java!
```

## 5. Comments in Java

### Single-line Comment
```java
// This is a single-line comment
System.out.println("Hello, Java!");
```

### Multi-line Comment
```java
/*
This is a multi-line comment.
It spans multiple lines.
Useful for documentation.
*/
System.out.println("Hello, Java!");
```
