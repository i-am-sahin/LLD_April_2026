package lld1_april_2026.concurrency.adderSubtractorWithCallable;

import java.util.concurrent.Callable;

public class AdderWithCallable implements Callable<Integer> {
    private CountForCallable countForCallable;
    public AdderWithCallable(CountForCallable countForCallable) {
        this.countForCallable = countForCallable;
    }
    @Override
    public Integer call() throws Exception {
        for (int i = 1; i <= 100; i++) {
//            synchronized (count){
//                count.value += i;
//            }
            countForCallable.add(i);

        }

        return countForCallable.value;
    }
}
