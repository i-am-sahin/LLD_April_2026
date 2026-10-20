package lld1_april_2026.collections;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {
     static void main(String[] args) {
         LinkedList<String> tasks = new LinkedList<>();
         tasks.add("Task 1");
         tasks.add("Task 2");
         tasks.add("Task 3");

         //Fast insertion and deletion at both ends -- O(1)
         tasks.addFirst("Task 0");
         tasks.addLast("Task 4");

         //Remove from front -- O(1)
         String next = tasks.removeFirst();
         System.out.println("Next task to process: " + next);


    }
}
/*

   Internally Implemnented as a Doubly Linked List
   Best for :   Insertion and Deletion at both ends, when you mostly add/remove from the front or back of the list
 */
