package lld1_april_2026.concurrency.adderSubtractorWithCallable;

public class CountForCallable {
    public int value = 0;

    public synchronized void add(int i){
        value += i;
    }
    public synchronized void subtract(int i){
        value -= i;
    }
}
