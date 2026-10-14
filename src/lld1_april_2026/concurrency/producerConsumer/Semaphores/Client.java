package lld1_april_2026.concurrency.producerConsumer.Semaphores;

import java.util.concurrent.Semaphore;

public class Client {
    static void main() {
        Store store = new Store();
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        //Creating the Producer thread.
        for (int i = 0; i < 8; i++) {
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore, i);
            new Thread(producer , "Producer - " + i).start();
        }

        for (int i = 0; i < 20; i++) {
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore, i);
            new Thread(consumer, "Consumer - " + i).start();
        }
    }

}
