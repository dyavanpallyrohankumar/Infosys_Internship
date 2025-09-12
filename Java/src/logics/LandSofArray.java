package logics;

public class LandSofArray {
	public static int largest(int[] array) {
		int large = 0;
		for (int i = 0; i < array.length; i++) {
			if (large < array[i])
				large = array[i];
		}
		return large;
	}

	public static int smallest(int[] array) {
		int small = 100000;
		for (int i = 0; i < array.length; i++) {
			if (small > array[i])
				small = array[i];
		}
		return small;
	}

	public static void main(String[] args) {
		int array[] = { 10, 200, 30, 40, 50 };
		System.out.println(largest(array));
		System.out.println(smallest(array));
	}
}