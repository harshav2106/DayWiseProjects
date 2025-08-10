package com.wipro.menudemo;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;
import java.util.ArrayList;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws Exception {

        ExecutorService ex = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int taskNum = 1; taskNum <= 5; taskNum++) {
            int finalTaskNum = taskNum;

            Callable<Integer> task = () -> {
                try {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("Task " + finalTaskNum + " prints: " + i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Task " + finalTaskNum + " interrupted");
                    return 0;
                }
                return 10;
            };

            futures.add(ex.submit(task));
        }
        ex.shutdown();
        for (int i = 0; i < futures.size(); i++) {
            Future<Integer> future = futures.get(i);
            Integer result = future.get();
            System.out.println("Task " + (i + 1) + " completed with result: " + result);
        }
    }
}
