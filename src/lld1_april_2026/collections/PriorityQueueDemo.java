package lld1_april_2026.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    static void main() {
        // Min heap by default - smallest element has the highest priority
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Max heap - largest element has the highest priority
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);


        // Elements come out in priority order, Not in the order they were added
        System.out.println(pq.poll()); // 10 (Smallest element)
        System.out.println(pq.poll()); // 20
        System.out.println(pq.poll()); // 30

    }
}
