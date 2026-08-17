package lld1_april_2026.concurrency.adderSubtractorWithCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ClientForCallable {
    public static void main(String[] args) throws Exception {
        System.out.println("main");
        CountForCallable countForCallable = new CountForCallable();
        AdderWithCallable adderWithCallable = new AdderWithCallable(countForCallable);
        SubtractorWithCallable subtractorWithCallable = new SubtractorWithCallable(countForCallable);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> adderFuture = executorService.submit(adderWithCallable);
        Future<Integer>  subtractorFuture = executorService.submit(subtractorWithCallable);
        Integer adderResult = adderFuture.get();
        Integer substractorResult = subtractorFuture.get();
        System.out.println(adderResult + " " + substractorResult);
        System.out.println("Value of Count: " + countForCallable.value);
        executorService.shutdown();
    }
}
