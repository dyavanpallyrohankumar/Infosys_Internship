package logics;

public class SortOfZero {

	public static void main(String[] args) {

		int array[] = { 7, 5, 8, 0, 9, 6, 3, 0, 0, 5 };
		int[] newarr = new int[array.length];
		int index = 0;

		for (int j = 0; j < array.length; j++) {
			if (array[j] != 0) {
				newarr[index++] = array[j];
			}
		}

		for (int j = 0; j < array.length; j++) {
			System.out.println(newarr[j]);
		}
	}
}

////
//public class SortOfZero {
//	public static void main(String[] args) {
//		int array[] = { 7, 5, 0, 6, 9, 6, 3, 0, 0, 5 };
//		int lenofarray = array.length - 1;
//		for (int j = 0; j < array.length; j++) {
//			if (array[j] != 0) {
//				continue;
//			} else {
//				int temp = array[j];
//				array[j] = array[j];
//				array[j + 1] = temp;
//				lenofarray--;
//			}
//		}
//		for (int j = 0; j < array.length; j++) {
//			System.out.println(array[j]);
//		}
//	}
//}