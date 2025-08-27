package logics;

public class RemoveElement {

	public static int removeElement(int arr[], int val) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != val) {
				arr[k] = arr[i];
				k++;
			}
			System.out.println(arr[i]);
		}
		return k;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2 };
		int val = 2;
		System.out.println(removeElement(arr, val));
	}
}
