package Java_Beyond_Basics.Lambda_Expression;

@FunctionalInterface
interface calci {
    void calculate(int a, int b);
}

public class MethodReferanceDemo {
    public static void add(int x, int y) {
        System.out.println("Addition: " + (x + y));
    }

    public static void main(String[] args) {
        calci lamdafunc = (a, b) -> MethodReferanceDemo.add(a, b);
        lamdafunc.calculate(843, 253);

        calci methref = MethodReferanceDemo::add;
        methref.calculate(734862, 9643);
    }

}
