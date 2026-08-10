package lld1_april_2026.concurrency.executorService.NumberPrinter;

public class NumberPrinter implements Runnable {

    private int numberToPrint;
    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }
    @Override
    public void run() {
        System.out.println("Number: " + numberToPrint + " printed by " + Thread.currentThread().getName());
    }
}

/*
    Task 1 : Print 1
    Task 2 : Print 2
    .
    .
    .
    .
    Task 10 : Print 11
    .
    .
    .
    Task 100 : print 100;
 */
