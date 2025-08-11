package remaning;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalcost = 0;
		char wanttoadditem = 'y';
		int unitprice = 10;
		int quantity = 1;
		while (wanttoadditem == 'y') {
			totalcost = totalcost + (quantity * unitprice);
			System.out.println("order plced sucess");
			System.out.println("total cost" + totalcost);
			System.out.println("do you wnt to add more food items");
			String input = sc.nextLine();
			wanttoadditem = input.charAt(0);
			sc.close();
		}
	}

}