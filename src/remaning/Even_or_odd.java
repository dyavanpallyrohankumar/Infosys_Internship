package remaning;
import java.util.Scanner;

public class Even_or_odd {
	
public static void check(int num){
	if (num%2==0) {
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}

}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		System.out.println("enter number");
		int i=sc.nextInt();
		check(i);	
		sc.close();
		}
	  
	}

}