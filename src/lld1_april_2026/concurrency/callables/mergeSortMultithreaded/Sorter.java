package lld1_april_2026.concurrency.callables.mergeSortMultithreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> list;
    private ExecutorService executorService;

    public Sorter(List<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Base Case : if arr size is 1 or 0, return the array as it is already sorted.
        if(list.size() <= 1){
            return list;
        }
        //Divide the array : Find the mid point

        int mid = list.size() / 2;

        //Create two sub-arrays : left and right
        List<Integer> left = new ArrayList<>(list.subList(0, mid));
        List<Integer> right = new ArrayList<>(list.subList(mid,list.size()));

        //Create two sorter Task

        Sorter leftSorter = new Sorter(left, executorService);
        Sorter rightSorter = new Sorter(right, executorService);

        // Submit the task to executor to run this in PARALLEL!
        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        //Wait for both the results

        List<Integer> sortedLeft = leftFuture.get();
        List<Integer> sortedRight = rightFuture.get();
        return merge(sortedLeft, sortedRight);

    }

    private List<Integer> merge(List<Integer> left, List<Integer> right){
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while(i < left.size() && j < right.size()){
            if(left.get(i) <= right.get(j)){
                result.add(left.get(i));
                i++;
            }
            else {
                result.add(right.get(j));
                j++;
            }
        }

        //Add the remaining elements
        while(i < left.size()){
            result.add(left.get(i));
            i++;
        }
        while(j < right.size()){
            result.add(right.get(j));
            j++;
        }
        return result;
    }
}
