package collection_framework.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Assignment_1 {
    // class Tester {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> newList = new LinkedList<>();
        for (Integer integer : list) {
            if (!newList.contains(integer)) {
                newList.add(integer);
            }
        }
        return newList;
    }

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(15);
        list.add(10);
        // System.out.println(list.contains(15));
        List<Integer> updatedList = removeDuplicates(list);

        System.out.println("Linked list without duplicates");
        for (Integer value : updatedList) {
            System.out.print(value + " ");
        }
    }

}