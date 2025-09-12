package logics;

import java.util.Scanner;

public class SumofDigits {
	public static int digitSum(int number) {
		int sumofdigits = 0;
		do {
			int temp = number % 10;
			sumofdigits = sumofdigits + temp;
			number = number / 10;
		} while (number > 0);
		return sumofdigits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println("the sum of digits is " + digitSum(number));
		sc.close();
	}
}