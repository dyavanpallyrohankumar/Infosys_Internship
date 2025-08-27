package collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AlltypesOfClasses {
    public static void main(String[] args) {
        Set<Object> hashsetObject = new HashSet<>();
        Set<Object> linkedhashsetObject = new LinkedHashSet<>();
        Set<Object> treesetObject = new TreeSet<>();

        hashsetObject.add("Zoho");
        hashsetObject.add("Infosys");
        hashsetObject.add("Capgemini");
        hashsetObject.add("IBM");
        hashsetObject.add("Google");

        linkedhashsetObject.add("Zoho");
        linkedhashsetObject.add("Infosys");
        linkedhashsetObject.add("Capgemini");
        linkedhashsetObject.add("IBM");
        linkedhashsetObject.add("Google");

        treesetObject.add("Zoho");
        treesetObject.add("Infosys");
        treesetObject.add("Capgemini");
        treesetObject.add("IBM");
        treesetObject.add("Google");

        System.out.println(hashsetObject); // [Google, Infosys, IBM, Zoho, Capgemini]
        System.out.println(linkedhashsetObject);// [Zoho, Infosys, Capgemini, IBM, Google] this is the order of insertion
        System.out.println(treesetObject);// [Capgemini, Google, IBM, Infosys, Zoho]

    }
}
