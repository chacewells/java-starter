package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Hello, World!");
        testMethod();

        var p = new Person();

        p.setName("Aaron face");
        p.setCity("Snoqualmie");
        p.setAge(40);

        System.out.println(p);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> sumOfSquaresResult = executor.submit(() -> {
            var sumOfSquares = 0;
            for (int i = 0; i < 20; i++) {
                sumOfSquares += Math.pow(i, 2);
            }

            return sumOfSquares;
        });

        System.out.println("Waiting for sumOfSquares work...");
        Integer result = sumOfSquaresResult.get();

        System.out.println("Sum of squares result for " + 20 + " values: " + result);
    }

    static void testMethod() {
        System.out.println("oh hai world!");
    }
}
