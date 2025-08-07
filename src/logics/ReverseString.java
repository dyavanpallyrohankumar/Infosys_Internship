package logics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the text");
		String text = sc.nextLine();
		System.out.println(reversing(text));
		sc.close();
	}

	public static String reversing(String text) {
		String revered = "";
		for (int i = text.length() - 1; i >= 0; i--) {

			revered += text.charAt(i);
		}
		return revered;

	}
}