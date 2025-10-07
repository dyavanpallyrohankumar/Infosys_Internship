package RegularExpression;

import java.util.Scanner;

public class RE {

    public static void number() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.matches("[0-9]+")) {

            System.out.println("String contains only abcds");
        } else
            System.out.println("Contains the numer");
    }

    public static void alphabet() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.matches("[a-zA-Z]+")) {
            // if (input.matches("[a-zA-Z ]+")) { when the code should work space is given

            System.out.println("Contains the numer");
        } else
            System.out.println("String contains only abcds");
    }

    public static void alphanum() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.matches("[a-zA-Z]+") || input.matches("[0-9]+")) {
            System.out.println("Contains the number or alphabet");
        } else
            System.out.println("String contains only abcds");
    }

    public static void checklength() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.matches("[a-zA-Z0-9]+@{8}")) {
            System.out.println("Contains the 8 length");
        } else {
            System.out.println("invalid");
        }
    }

    public static void checklengthBetween5_12() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.matches("[a-zA-Z0-9]{5,12}")) {
            System.out.println("Contains the length between 5 to 12");
        } else {
            System.out.println("invalid");
        }
    }

    // public static void checklengthBetween5_12() {
    // Scanner sc = new Scanner(System.in);
    // String input = sc.nextLine();
    // if (input.matches("[a-zA-Z0-9]{5,12}")) {
    // System.out.println("Contains the length between 5 to 12");
    // } else {
    // System.out.println("invalid");
    // }
    // }

    public static void main(String[] args) {
        checklengthBetween5_12();
    }
}
