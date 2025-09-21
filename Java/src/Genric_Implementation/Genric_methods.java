package Genric_Implementation;

class Genric_methods<T, U> {

    public static <T> void printArray(T[] array) {
        System.out.println();
        for (T t : array) {
            System.out.print(" " + t + " ");
        }
    }

    public static void main(String[] args) {
        String names[] = { "a", "b" };
        Integer nums[] = { 1, 2, 3, 4, 56, 6, 7, 8, 9 };
        printArray(names);
        printArray(nums);
    }
}
