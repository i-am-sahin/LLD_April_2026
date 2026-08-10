package lld1_april_2026.concurrency.executorService.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    static void main() {
        // Create a fixed size of thread pool with 5 threads.
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //Create 100 threads and each thread prints a different number
        for (int i = 1; i <= 100; i++){

            // Old way of creating threads
//            Thread t1 = new Thread(new NumberPrinter(i));
//            t1.start();

            //New way of creating threads using ExecutorService
//            if(i == 80){
//                System.out.println();
//            }
            executorService.execute(new NumberPrinter(i));
        }
        


    }
}

/*
Key takeway : When you create multiple threads, You lose control over order of Execution.
 */
