package lld1_april_2026.concurrency.producerConsumer;

public class Producer implements Runnable{
    private Store store;
    public Producer(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if (store.getItems().size() < store.getMaxSize()) {
                    //Space Available or not

                    store.addItem(new Object());

                }
            }
        }
    }
}
