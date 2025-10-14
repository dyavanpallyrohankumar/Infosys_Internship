package Java_Beyond_Basics.Lambda_Expression;

interface Methods {
    public double claculations(double x, double y);
}

public class LamdaIMP {
    public static void main(String[] args) {
        Methods adder = (x, y) -> {
            return (x + y);
        };
        Methods sub = (x, y) -> x - y;
        Methods multiply = (x, y) -> x * y;
        Methods division = (x, y) -> x / y;

        System.out.println(adder.claculations(32847, 783));
        System.out.println(sub.claculations(32847, 783));
        System.out.println(multiply.claculations(32847, 783));
        System.out.println(division.claculations(32847, 783));
    }
}
