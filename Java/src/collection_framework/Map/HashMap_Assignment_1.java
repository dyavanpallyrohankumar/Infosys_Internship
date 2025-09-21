package collection_framework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_Assignment_1 {
    // class Tester {

    public static List<String> sortSales(Map<String, Integer> sales) {
        // Implement your logic here and change the return statement accordingly
        List<String> employeeNames = new ArrayList<>(sales.keySet());
        employeeNames.sort((name1, name2) -> sales.get(name2).compareTo(sales.get(name1)));
        return employeeNames;
    }

    public static void main(String args[]) {
        Map<String, Integer> sales = new HashMap<String, Integer>();
        sales.put("Mathew", 50);
        sales.put("Lisa", 76);
        sales.put("Courtney", 45);
        sales.put("David", 49);
        sales.put("Paul", 49);

        List<String> employees = sortSales(sales);

        System.out.println("Employees in the decreasing order of their sales\n=====================================");
        for (String employeeName : employees) {
            System.out.println(employeeName);
        }
    }

}