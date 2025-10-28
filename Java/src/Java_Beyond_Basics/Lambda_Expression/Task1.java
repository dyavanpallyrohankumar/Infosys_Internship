package Java_Beyond_Basics.Lambda_Expression;

interface InnerTask0 {
    public String assign();
}

interface InnerTask1 {
    public void display();
}

interface InnerTask2 {
    public double calculations(double n);
}

interface InnerTask3 {
    public boolean calculations(double n);
}

interface InnerTask4 {
    public int strings();
}

class InnerTask1_1 implements InnerTask1 {

    @Override
    public void display() {
        System.out.println("hello interns");
    }

}

public class Task1 {

    public static void main(String[] args) {
        InnerTask1 interns = () -> System.out.println("Hello interns");
        InnerTask1 time = () -> System.out.println("Current time " + System.currentTimeMillis());
        InnerTask0 test = () -> "LAmda is FUN";

        InnerTask2 square = (n) -> n * n;
        InnerTask3 remainder = (n) -> n % 2 == 0;
        InnerTask1_1 function = new InnerTask1_1();
        function.display();
        System.out.println(" using the override \n\n");
        interns.display();
        System.out.println(" using the lamda \n\n");
        String q = "jkkkkvdsjhgf";
    }
}
