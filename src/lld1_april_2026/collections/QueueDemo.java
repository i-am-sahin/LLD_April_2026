package lld1_april_2026.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    static void main() {
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("Sahin");
        queue.offer("Jeet");

        System.out.println(queue.poll()); // Removes and returns the head of the queue
        System.out.println(queue.peek()); // Returns the head of the queue without removing it

        Queue<String> waitingList = new LinkedList<>();


        // Adding elements to the queue : Enqueue
        waitingList.add("Customer 1");
        waitingList.add("Customer 2");
        waitingList.add("Customer 3");

        // Peek - view front without removing
        System.out.println("Next customer to serve: " + waitingList.peek());

        //Dequeue - remove from front
        String next = waitingList.poll();
        System.out.println("Serving: " + next); // "Customer 1"

        System.out.println(waitingList.size());
    }


}
