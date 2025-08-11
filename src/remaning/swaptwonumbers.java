package remaning;
import java.util.Scanner;

public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swapping the values of A is " + a + " & B is " + b);
        // int temp = a;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swaping the values of A is " + a + " & B is " + b);
        sc.close();

    }
}
