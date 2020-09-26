package Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class CallableMain {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<>();
        Callable callable;
        Future<Integer> future;
        for (int i = 1; i <= 10; i++) {
            callable = new Callable(i);
            future = executorService.submit(callable);
            list.add(future);
        }
        executorService.shutdown();


        int sum = 0;
        for (Future<Integer> f : list) {
            try {
                sum += f.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finished all threads: ");
        System.out.println("Sum all = " + sum);
    }
    }
