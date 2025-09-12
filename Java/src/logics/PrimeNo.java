package logics;

import java.util.Scanner;

public class PrimeNo {
	public static int CheckPrimeNumber(int number) {
		if (number < 1) {
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					return number;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();

		int s = CheckPrimeNumber(number);
		if (s != 1) {
			System.out.println("not prime number");
		} else {
			System.out.println("Prime");
		}
		sc.close();
	}
}