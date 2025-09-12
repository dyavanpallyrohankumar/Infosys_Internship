package collection_framework;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCounterChar {
    public static void main(String[] args) {
        String str = "Programming";

        char name[] = str.toCharArray();
        System.out.println(Arrays.toString(name));
        Map<Character, Integer> freqmap = new LinkedHashMap<>();

        for (char ch : name) {
            if (freqmap.containsKey(ch)) {
                freqmap.put(ch, freqmap.get(ch) + 1);
            } else {
                freqmap.put(ch, 1);
            }

        }
        System.out.println(freqmap);
    }
}
