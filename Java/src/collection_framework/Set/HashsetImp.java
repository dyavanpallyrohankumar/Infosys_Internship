package collection_framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetImp {
    public static void main(String[] args) {
        // Creating HashSet object
        Set<String> food = new HashSet<String>();
        food.add("Pasta"); // Adding elements to the HashSet
        food.add("Noodles");
        food.add("Sandwich");
        food.add("Pasta");
        food.add("Burger");
        food.add("Noodles");
        System.out.println("HashSet output without the duplicates: ");
        System.out.println(food);

        Set<String> food1 = new LinkedHashSet<String>();
        food1.add("Pasta"); // Adding elements to the HashSet
        food1.add("Noodles");
        food1.add("Sandwich");
        food1.add("Pasta");
        food1.add("Burger");
        food1.add("Noodles");
        System.out.println("LinkedHashSet output without the duplicates IN THE INSORTION ORDER: ");
        System.out.println(food1);

        Set<String> fod1 = new TreeSet<String>();
        fod1.add("Pasta"); // Adding elements to the HashSet
        fod1.add("Noodles");
        fod1.add("Sandwich");
        fod1.add("Pasta");
        fod1.add("Burger");
        fod1.add("Noodles");
        System.out.println("TreeSet output without the duplicates IN THE Ascending ORDER: ");
        System.out.println(fod1);
    }
}
