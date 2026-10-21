package lld1_april_2026.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet is backed by Balanced Binary Search Tree (Red-Black Tree) Internal implementation.
        // All Operation in TreeSet are O(log n) time complexity approximately. Because it's the height of the balanced tree.
        Set<Integer> scores = new TreeSet<>();

        scores.add(15);
        scores.add(10);
        scores.add(20);
        scores.add(10); // Duplicate, will not be added. Ignored.

        // Iteration is in sorted order
        for (Integer score : scores) {
            System.out.println(score); // 10 -> 15 -> 20
        }

    }
}
