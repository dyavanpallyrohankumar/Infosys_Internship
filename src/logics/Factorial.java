package logics;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int no) {
		if (no <= 1) {
			return 1;
		}
		return (no * factorial(no * 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		int number = sc.nextInt();
		System.out.println("the factorial of" + number + " is " + factorial(number));
		sc.close();
	}
}