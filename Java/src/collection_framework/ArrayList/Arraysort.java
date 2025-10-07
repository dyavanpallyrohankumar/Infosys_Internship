package collection_framework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraysort {
    public static void main(String[] args) {

        Integer array[] = { 235, 265, 234, 123, 435, 546, 76 };
        String unsorted[] = { "cherry", "apple", "grape", "fig", "banana", "date" };

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(unsorted));
        System.out.println("after sorting");

        Arrays.sort(array);// gives in ascending order
        Arrays.sort(array, Collections.reverseOrder());// gives in descending order

        Arrays.sort(unsorted);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(unsorted));

        List<Integer> list = new ArrayList<>(Arrays.asList(235, 265, 234, 123, 435, 546, 76));
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

}
