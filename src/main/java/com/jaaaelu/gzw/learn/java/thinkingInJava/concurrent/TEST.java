package com.jaaaelu.gzw.learn.java.thinkingInJava.concurrent;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TEST {

    public static void main(String[] args) {
        testLiftOff();

        System.out.println();

        testThread();

        System.out.println();

        testExecutor();

        System.out.println();

        testCallable();

    }

    private static void testCallable() {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results =
                new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++)
            results.add(exec.submit(new TaskWithResult(i)));
        for (Future<String> fs : results)
            try {
                // get() blocks until completion:
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                return;
            } catch (ExecutionException e) {
                System.out.println(e.getMessage());
            } finally {
                exec.shutdown();
            }
    }

    private static void testExecutor() {
//        ExecutorService cachedExec = Executors.newCachedThreadPool();
//        for (int i = 0; i < 5; i++) {
//            cachedExec.execute(new LiftOff());
//        }
//        cachedExec.shutdown();
//
//        System.out.println();
//
//        ExecutorService fixedExec = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            fixedExec.execute(new LiftOff());
//        }
//        fixedExec.shutdown();
//
//        System.out.println();

        ExecutorService singleThreadExec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            singleThreadExec.execute(new LiftOff());
        }
        singleThreadExec.shutdown();

        System.out.println();
    }

    private static void testThread() {
        new Thread(new LiftOff()).start();

        System.out.println();

        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }

        System.out.println();
    }

    private static void testLiftOff() {
        new LiftOff().run();
    }
}
