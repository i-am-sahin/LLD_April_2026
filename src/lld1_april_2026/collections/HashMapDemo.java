package lld1_april_2026.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<String, Integer>();

        //Put key-value pairs into the HashMap
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 92);

        //Get by key - O(1) time complexity approximately
        System.out.println("Alice's score: " + studentScores.get("Alice")); // 90

        //Check if a key exists
        System.out.println("Contains Bob? " + studentScores.containsKey("Bob")); // true

        //Overwrite value for an existing key
        studentScores.put("Alice", 95);
        System.out.println("Alice's new score: " + studentScores.get("Alice")); // 95

        //Iterate over Entries
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
