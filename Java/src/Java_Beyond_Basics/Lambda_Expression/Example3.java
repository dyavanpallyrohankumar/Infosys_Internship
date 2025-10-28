package Java_Beyond_Basics.Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tiwari", "RK", "Vure", "vodnala");

        names.forEach(name -> System.out.println(name));
    }
}
