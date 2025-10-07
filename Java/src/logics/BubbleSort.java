package logics;

//Swaping of adject elements 
//comparison based sorting alogorithm
public class BubbleSort {

    public static void bubbleSorting(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("==" + i + "==");
            for (int j = 0; j < array.length - i - 1; j++) {
                System.out.println("==" + j + "==");
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 345, 457, 234, 314, 2451 };
        System.out.println("before swapping");
        for (int i : array) {
            System.out.println(i);
        }

        bubbleSorting(array);

        System.out.println("after swaping");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
