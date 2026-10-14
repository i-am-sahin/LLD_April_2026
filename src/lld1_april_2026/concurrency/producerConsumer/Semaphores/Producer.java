package lld1_april_2026.concurrency.producerConsumer.Semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private int id;

    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore, int id) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.id = id;
    }

    @Override
    public void run() {
        while (true){
            try {
                producerSemaphore.acquire(); // It waits for an empty Slot.
                store.addItem(id);
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restores the interrupt flag, for that particular flag.
                break;
            }

        }
    }
}
