package collection_framework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Assignment_3 {
    // class Tester {

    public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
        // Implement your logic here and change the return statement accordingly
        List<Integer> mergeList = new LinkedList<>();
        mergeList.addAll(listOne);
        mergeList.addAll(listTwo);
        Collections.sort(mergeList);

        // int i = 0, j = 0;
        // while (i < listOne.size() && j < listTwo.size()) {
        // if (listOne.get(i) < listTwo.get(j)) {
        // mergeList.add(listOne.get(i));
        // i++;
        // } else if (listOne.get(i) > listTwo.get(j)) {
        // mergeList.add(listTwo.get(j));
        // j++;
        // } else {
        // mergeList.add(listOne.get(i));
        // i++;
        // j++;
        // }
        // }

        return mergeList;
    }

    public static void main(String args[]) {
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(13);
        listOne.add(21);
        listOne.add(42);
        listOne.add(56);

        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(15);
        listTwo.add(20);
        listTwo.add(21);
        listTwo.add(85);
        listTwo.add(92);

        List<Integer> mergedList = mergeLists(listOne, listTwo);
        System.out.println(mergedList);
    }
}