package lld1_april_2026.concurrency.callables;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws Exception {
        SumCalculator sumCalculator = new SumCalculator(100);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(sumCalculator); //This is not a blocking call. It will return immediately and the task will be executed in background.

        //I Can do other work in the main thread while the task is being executed in background.
        System.out.println("Task Submitted. Doing other work in main thread...");

        //When i need the result, I can Call future.get().
        Integer result = future.get(10, TimeUnit.MICROSECONDS); //This is a blocking call. It will wait until the task is completed and the result is available.
        System.out.println("Sum of 1 to 100 = " + result);
        executorService.shutdown();


    }
}
