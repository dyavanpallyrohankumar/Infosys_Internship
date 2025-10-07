package stringMethods;

public class LengthofString {
    public static void main(String[] args) {
        String str = "hello world";
        // length of the string
        demoOfLenthMethod(str);

        System.out.println(str.substring(2, 4));

        System.out.println(str.equals("hello world"));
        System.out.println(str.equalsIgnoreCase("HELLO WORLD"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("flow".startsWith("flower"));
        System.out.println(str.endsWith("d"));

        System.out.println(str.replace("World", "rohan"));
    }

    private static void demoOfLenthMethod(String str) {
        System.out.println(str.length());
    }

}