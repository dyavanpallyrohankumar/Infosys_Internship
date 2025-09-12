package collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> linearArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements to be added in the array list");
        int input = sc.nextInt();
        System.out.println("enter the numbers");
        for (int i = 0; i < input; i++) {
            int temp = sc.nextInt();
            linearArray.add(temp);
        }

        System.out.println("enter the number you want to search");
        int search = sc.nextInt();
        for (Integer integer : linearArray) {
            if (integer == search) {
                System.out.println(linearArray.indexOf(search));

            }
        }
        // System.out.println("number not in the list");
        sc.close();
    }
}
