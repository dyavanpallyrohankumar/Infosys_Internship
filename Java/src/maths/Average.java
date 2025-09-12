package maths;

import java.util.Scanner;

public class Average {
	public static void AverageNo(double no1, double no2) {
		System.out.println("average of 2 numbers " + (no1 + no2) / 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the numbers");
			double num1 = sc.nextInt();
			double num2 = sc.nextInt();
			AverageNo(num1, num2);
		}
	}
}