package lld1_april_2026.concurrency.HelloWorldPrinter;

public class HeloWorldPrinter implements Runnable {

    public void run(){

        // This is the place where you
        // put your code that needs to be
        // executed in parallel

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "Hello World - " + i);
        }

        helperMethod(); // This helperMethod will also run from the same parallel thread Because it's under run();

    }
    private void helperMethod(){
        System.out.println("In Helper Method");
    }
}
