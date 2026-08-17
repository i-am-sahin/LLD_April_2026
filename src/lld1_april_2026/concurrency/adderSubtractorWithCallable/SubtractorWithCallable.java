package lld1_april_2026.concurrency.adderSubtractorWithCallable;

import java.util.concurrent.Callable;

public class SubtractorWithCallable implements Callable<Integer> {
    CountForCallable countForCallable;
    public SubtractorWithCallable(CountForCallable countForCallable) {
        this.countForCallable = countForCallable;
    }
    @Override
    public Integer call() throws Exception {
        for (int i = 1; i <= 100; i++){
//            synchronized (count){
//                count.value -= i;
//            }
            countForCallable.subtract(i);
        }
        return countForCallable.value;
    }

}
