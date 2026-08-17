package lld1_april_2026.concurrency.adderSubtractorSynchronized;

public class Adder implements Runnable{

    private Count count;
    public Adder(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {

            synchronized (count){ //Lock on the shared Object
                count.value += i;
            }

        }


    }
}
