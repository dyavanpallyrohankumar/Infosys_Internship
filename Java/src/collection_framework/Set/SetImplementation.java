package collection_framework.Set;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("avacado");
        fruits.add("pineapple");
        fruits.add("mango");
        fruits.add("avacado");
        // Storing is in this order == [orange, pineapple, avacado, Banana, mango] ==
        // noduplicate values are allowed
        System.out.println("Fruits " + fruits);

        System.out.println("Contains Mango? " + fruits.contains("mango"));
        fruits.remove("Banana");
        System.out.println("after removing of banana " + fruits);

    }
}
