package lld1_april_2026.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // LinkedHashSet maintains insertion order and does not allow duplicates.
        //How it Does this? --> It is backed by a HashMap and a Doubly Linked List. The HashMap provides O(1) time complexity for add, remove, and contains operations, while the Doubly Linked List maintains the order of elements.
        Set<String> visitedPage = new LinkedHashSet<>();
        visitedPage.add("Home");
        visitedPage.add("About");
        visitedPage.add("Contact");
        visitedPage.add("Home"); // Duplicate, will not be added. Ignored.

        for (String page : visitedPage){
            System.out.println(page); // Home -> About -> Contact
        }
    }
}
