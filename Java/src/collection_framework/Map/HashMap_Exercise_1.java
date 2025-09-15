package collection_framework.Map;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class Student {

    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
        // Implement your logic here and change the return statement accordingly
        Map<String, Double> MaxMinScorers = new HashMap<String, Double>();
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        String maxScorer = "";
        String minScorer = "";
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxScorer = entry.getKey();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                minScorer = entry.getKey();
            }
        }
        MaxMinScorers.put(maxScorer, max);
        MaxMinScorers.put(minScorer, min);
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxScorer = entry.getKey();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                minScorer = entry.getKey();
            }
        }
        MaxMinScorers.put(maxScorer, max);
        MaxMinScorers.put(minScorer, min);
        return MaxMinScorers;
    }
}

public class HashMap_Exercise_1 {
    // class Tester {

    public static void main(String args[]) {
        Map<String, Double> studentMarks = new HashMap<String, Double>();
        studentMarks.put("Lily", 90.0);
        studentMarks.put("Robin", 68.0);
        studentMarks.put("Marshall", 76.5);
        studentMarks.put("Neil", 67.0);
        studentMarks.put("Ted", 92.0);

        Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);

        System.out.println("Details of Top Scorers & Low Scorers\n====================================");
        for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

    }
}