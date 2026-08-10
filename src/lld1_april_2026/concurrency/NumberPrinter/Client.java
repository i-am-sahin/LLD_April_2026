package lld1_april_2026.concurrency.NumberPrinter;

public class Client {
    static void main() {
        System.out.println("Main Method is executing in " + Thread.currentThread().getName());


        //Create 100 threads and each thread prints a different number
        for (int i = 1; i <= 100; i++){
            Thread t1 = new Thread(new NumberPrinter(i));
            t1.start();
        }
        


    }
}

/*
Key takeway : When you create multiple threads, You lose control over order of Execution.
 */
