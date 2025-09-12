package remaning;
import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int totalcost=0;
        char wanttoadditem='N';
        int unitprice=10,quantity=1;

        do {
            totalcost=totalcost+(quantity*unitprice);
            System.out.println("orderplcaed");
            System.out.println("total cost= "+totalcost);
            System.out.println("do you wamt to add more items");
            String input=sc.nextLine();
            wanttoadditem=input.charAt(0);
            sc.close();

        } while ((wanttoadditem=='y') || (wanttoadditem=='s'));
    }

}