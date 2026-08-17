package lld1_april_2026.concurrency.adderSubtractor;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws Exception {
        Count count = new Count();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count,lock);


        Subtractor subtractor = new Subtractor(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        //Wait for both of them to finish.
        t1.join(); // .join : It'll wait until t1 finishes it's task.

        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t2.join();

        System.out.println("Final Count : " + count.value);
    }
}
