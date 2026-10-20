package lld1_april_2026.collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        //All Operation in hashSet are O(1) time complexity approximately
        //No duplicates allowed
        // No Ordering of elements is guaranteed here.
        HashSet<String> hs = new HashSet(); // backed by HashMap Internal implementation
        hs.add("Alice");
        hs.add("Bob");
        hs.add("Charlie");
        System.out.println(hs.size()); // 3

        System.out.println(hs.contains("Alice")); // true
    }
}
