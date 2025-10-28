package Java_Beyond_Basics.Lambda_Expression;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        System.out.println("======Function Examples========");
        Function<Integer, Integer> addTen = (num) -> num + 10;
        System.out.println("Add 10: " + addTen.apply(27));

        Function<String, Integer> getlen = (str) -> str.length();
        System.out.println("Add 10: " + getlen.apply("jksalbgksjdbg"));

        Function<String, String> getUpper = (str) -> str.toUpperCase();
        System.out.println("Add 10: " + getUpper.apply("kjsghguyf"));

    }

}
