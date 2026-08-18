package lld1_april_2026.concurrency.adderSubtractorSynchronizedMethod;

public class Count {
    private int value = 0;

// Java takes a lock on "This" <-  Current Object.
// That means at this time you can't call any other synchronized function from this object.
// But You can call the Normal methods.
    public synchronized void incrementBy(int amount){
        this.value += amount;
    }
    public synchronized void decrementBy(int amount){
        this.value -= amount;
    }

    public int getValue() {
        return value;
    }
}
