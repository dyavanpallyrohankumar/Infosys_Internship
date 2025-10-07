package stringMethods;

public class IndexMethods {

	public static void main(String[] args) {
		String str = "hello world";
		// returns the index of the string when index method is used

		// gives index from starting of the word where it comes
		System.out.println(str.indexOf("o"));
		// gives index from ending of the word where it comes
		System.out.println(str.lastIndexOf('l'));

	}

}