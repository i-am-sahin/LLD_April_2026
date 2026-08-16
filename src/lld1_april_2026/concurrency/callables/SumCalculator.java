package lld1_april_2026.concurrency.callables;

import java.util.concurrent.Callable;

public class SumCalculator implements Callable<Integer> {
    private int n;


    public SumCalculator(int n) {
        this.n = n;
    }
    public Integer call() throws Exception{
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum; // I can return value here.
    }

}
