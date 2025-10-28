package Java_Beyond_Basics.Lambda_Expression;

import java.util.ArrayList;
import java.util.List;

public class StreamsFilter {

    public static void main(String[] args) {
        List<String> departmentlist = new ArrayList<>();
        departmentlist.add("Supply");
        departmentlist.add("HR");
        departmentlist.add("Sales");
        departmentlist.add("Marketing");

        System.out.println("*********");
        dataStartswithS(departmentlist);

        System.out.println("*********");
        dataLengthWiseFilter(departmentlist);

        System.out.println("*********");
        dataOnlyHr(departmentlist);

    }

    private static void dataOnlyHr(List<String> departmentlist) {
        departmentlist.stream().filter(word -> word.equalsIgnoreCase("hr")).forEach(System.out::println);
    }

    private static void dataLengthWiseFilter(List<String> departmentlist) {
        departmentlist.stream().filter(word -> word.length() > 3).forEach(System.out::println);
    }

    private static void dataStartswithS(List<String> departmentlist) {
        departmentlist.stream().filter(word -> word.startsWith("S")).forEach(System.out::println);
    }

}
