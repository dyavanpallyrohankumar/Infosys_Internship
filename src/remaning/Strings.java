package remaning;
import java.util.Scanner;

public class Strings {
	
	public static String display(String nme,String curse) {
        String view="i am "+nme+" and learning "+curse;
        
		return view;
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println(	"Enter name and course");

		String name = sc.nextLine();
		String course =  sc.nextLine();
		
		System.out.println(	display(name,course));
		sc.close();
	}

}