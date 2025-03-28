package jdk7.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println("Task " + finalI + " is running");
            });
        }

        executorService.shutdown();
    }
}