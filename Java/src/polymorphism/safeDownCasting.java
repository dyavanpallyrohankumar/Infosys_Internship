// 🔼 Upcasting (Safe & Common)
// Upcasting is when a subclass object is treated as a superclass type.

// ✅ Why use it?
// To use polymorphism (access all report types generically)
// It’s implicit and safe—no casting needed
// You can only access methods defined in the superclass

// where upcasting is used to access the superclass but not accesable for the child class
//(we give referance to the parent class by child object)

// 🔽 Downcasting (Risky & Less Common)
// Downcasting is when you take a superclass reference and cast it back to a subclass type.

package polymorphism;

class Animal {
}

class Dog extends Animal {
    int number;
}

public class safeDownCasting {

    public static void main(String[] args) {
        Animal a = new Dog(); // here we are upcasting

        if (a instanceof Dog) {
            Dog d = (Dog) a;// here we are doing downcasting
            d.number = 10000;
            System.out.println("Downcasting done safely and sucessfully");
        }
    }
}

// The instanceof keyword is used to test whether an object is an instance of a
// specific class or subclass.
// 📌 Syntax: object instanceof ClassName

// Returns true if object is an instance of ClassName or a subclass.
// Returns false otherwise.
// Also checks against interfaces.

// 🧠 Why Use instanceof?
// Mostly for safe downcasting.
// If you try to downcast without checking the type, you risk a
// ClassCastException at runtime.
