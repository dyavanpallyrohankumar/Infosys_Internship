package collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    public static void traversal(ArrayList<String> cart) {
        for (String string : cart) {
            System.out.println(string);
        }
    }

    public static void addOfItems(String item, ArrayList<String> cart) {

        cart.add(item);
        System.out.println(cart);

        if (cart.add(item)) {
            System.out.println("thanks for using");
            System.out.println("keep visiting again");
        }
    }

    public static void deleteOfItems(String item, ArrayList<String> cart) {
        cart.remove(item);
        System.out.println(cart);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();
        String item;

        do {
            System.out.println("1. adding \n 2.removing \n 3.traverse\n enter the input ");
            char input = sc.nextLine().charAt(0);
            switch (input) {
                case 1:
                    System.out.println("enter the item name");
                    item = sc.nextLine();
                    addOfItems(item, cart);
                    break;
                case 2:
                    System.out.println("enter the item name");
                    item = sc.nextLine();
                    deleteOfItems(item, cart);
                    break;
                case 3:
                    traversal(cart);
                    break;
                case 4:
                    sc.close();
                    return;
                   
                default:
                System.out.println("enter proper input");
                    break;
            }

        } while (true);

        //
        // addOfItems(item, cart);
        // deleteOfItems("String item", cart);
    }
}