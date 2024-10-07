import java.util.*;

public class CalculatetheFrequencyofEachWord {

    public static void printFreq(String str) {
        Map<String, Integer> mp = new HashMap<>();

        String[] words = str.split("\\s+");
        // System.out.println(words);
        for (String word : words) {
            word = word.toLowerCase();
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "Geeks For Geeks is for Geeks";
        printFreq(str);
    }
}