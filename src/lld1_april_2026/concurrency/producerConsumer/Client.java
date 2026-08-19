package lld1_april_2026.concurrency.producerConsumer;

public class Client {
    static void main() {
        Store store = new Store(10);

        //Hire 8 factory workers

        for(int i = 0; i < 8; i++){
            Producer producer = new Producer(store);
            new Thread(producer).start();
        }

        //Open doors for 20 customers

        for(int i = 0; i < 20; i++){
            Consumer consumer = new Consumer(store);
            new Thread(consumer).start();
        }
    }

}
