package lld1_april_2026.concurrency.producerConsumer.Semaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private Queue<Object> items;

    public Store() {
        this.items = new ConcurrentLinkedDeque<>();
    }

    public Queue<Object> getItems() {
        return items;
    }

    public void addItem(int id){
        items.add(new Object());
        System.out.println("Item added. Size is : " + items.size() + " By thread: " + id);
    }

    public void removeItem(int id){
        Object item = items.remove(items.size() - 1);
        System.out.println("Item Removed. Size is : " + items.size() + " By thread: " + id);
    }
}
