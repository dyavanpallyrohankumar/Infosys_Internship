package remaning;

public class Enums {

public enum Trafficlight {RED,GREEN,YELLOW,ORANGE};

	public static void main(String[] args) {
		String name="ROHAN KUMAR";
		
		for (char string : name.toCharArray()) {
			System.out.println(string);
		}

		for (int i = 0; i <name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}

}