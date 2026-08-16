package lld1_april_2026.concurrency.callables.mergeSortMultithreaded;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        List<Integer> arr = List.of(9,2,4,7,3,5,1,2,6,8,4,9,1,2);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arr, executorService);

        Future<List<Integer>> future = executorService.submit(sorter);
        List<Integer> sortedArr = future.get();
        System.out.print("Before Sorting: ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("After Sorting: ");
        for(int i : sortedArr){
            System.out.print(i + " ");
        }
        executorService.shutdown();
    }
}
