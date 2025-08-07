package logics;

import java.util.Scanner;

//public class Palindrome {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the text");
//		String text = sc.nextLine();
//		String reversed = reversing(text);
//		if (reversed.equals(text))
//			System.out.println(" i.e the text entered is polindrome");
//		else
//			System.out.println(" i.e the text entered is not polindrome");
//		sc.close();
//	}
//
//	public static String reversing(String text) {
//		String revered = "";
//		for (int i = text.length() - 1; i >= 0; i--) {
//			revered += text.charAt(i);
//		}
//		return revered;
//	}
//}

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the text");
		String text = sc.nextLine();
		String reversed = new StringBuilder(text).reverse().toString();

		if (reversed.equals(text))
			System.out.println(" i.e the text entered is polindrome");

		else
			System.out.println(" i.e the text entered is not polindrome");

		sc.close();
	}
}
