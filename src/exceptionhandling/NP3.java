package exceptionhandling;

class Student {
	String name;
}

public class NP3 {
	public static void main(String[] args) {
		try {
			Student s = null;
			System.out.println(s.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}