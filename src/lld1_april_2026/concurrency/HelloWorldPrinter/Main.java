package lld1_april_2026.concurrency.HelloWorldPrinter;

public class Main {

    static void main() {
        System.out.println("Hii from main thread" + Thread.currentThread());


        //Step 1 : Actual instance of our task
        HeloWorldPrinter hwi = new HeloWorldPrinter();

//        //Now, We can run the task
//
//        hwi.run();


        // Step 2 : Create a Thread and give it your task.

        Thread t = new Thread(hwi);
        System.out.println("---------- Calling run() directly ----------");
        t.run();
        System.out.println("---------- calling start() ----------");

        // Step 3: Start your Thread
        t.start(); // This t.start(), Create a new thread and Calls run() on that thread.


        System.out.println("Main thread continues......");
    }

}

/*
    runnable Creates the task.
    Then go to the thread object, pass the task.it'll run it.

    thread.run() -> This calls the run method in the current(main) thread. Because We just override the run() method.

    thread.start() -> this start a new thread. and run the run()'s Code in that created new thread.

 */
