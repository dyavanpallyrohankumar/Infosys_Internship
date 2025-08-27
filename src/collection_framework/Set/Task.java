package collection_framework.Set;

import java.util.HashSet;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        // Set<String> alltypes = new HashSet<>();
        // alltypes.add("PMIS");
        // alltypes.add("6578");
        // alltypes.add("985.908");
        // alltypes.add("Adithya");
        // alltypes.add("A");
        // System.out.println(alltypes);




        Set<Object> alltypes = new HashSet<>();
        alltypes.add("PMIS"); // String
        alltypes.add(6578); // Integer
        alltypes.add(985.908); // Double
        alltypes.add("Adithya"); // String
        alltypes.add('A'); // Character
        alltypes.add(true); // Boolean
        System.out.println(alltypes);

        for (Object object : alltypes) {
            System.out.println(object+" is  "+object.getClass().getSimpleName());
        }

    }
}
