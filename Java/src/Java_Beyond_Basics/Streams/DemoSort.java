package Java_Beyond_Basics.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSort {
    /**
     * Demonstrates different sorting techniques using Collections and lambda
     * expressions.
     * This main method showcases:
     * 1. Natural ordering sort using Collections.sort()
     * 2. Reverse ordering sort using lambda comparator
     * 3. Custom sorting based on string length
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("yamuma", "rajil", "modi bro", "maneesh", "va");
        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, (n1, n2) -> n2.compareTo(n1));
        System.out.println(names);

        // names.sort(Collections.reverseOrder());
        // System.out.println(names);

        Collections.sort(names, (n1, n2) -> n1.length() - n2.length());
        System.out.println("by using length\n" + names);
    }
}
