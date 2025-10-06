package collection_framework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HahMap_Assignment_2 {
    // class Tester {

    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
        // Implement your logic here and change the return statement accordingly

        Map<String, Integer> resultMap = new HashMap<>();

        // Add all entries from mapOne
        for (Map.Entry<String, Integer> entry : mapOne.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue());
        }

        // Merge entries from mapTwo
        for (Map.Entry<String, Integer> entry : mapTwo.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (resultMap.containsKey(key)) {
                if (!resultMap.get(key).equals(value)) {
                    // Conflict: add with "new" prefix
                    resultMap.put("new" + key, value);
                }
                // If values are same, do nothing
            } else {
                resultMap.put(key, value);
            }
        }

        return resultMap;

    }

    public static void main(String args[]) {
        Map<String, Integer> mapOne = new HashMap<String, Integer>();
        mapOne.put("Kelly", 10);
        mapOne.put("Micheal", 20);
        mapOne.put("Ryan", 30);

        Map<String, Integer> mapTwo = new HashMap<String, Integer>();
        mapTwo.put("Jim", 15);
        mapTwo.put("Andy", 45);

        Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

        System.out.println("Merged Map\n===========");
        for (Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

    }
}
