//: concurrency/waxomatic/WaxOMatic.java
// Basic task cooperation.
package com.jaaaelu.gzw.learn.java.thinkingInJava.concurrent;

import java.util.concurrent.*;

class Car1 {
    private boolean waxOn = false;

    public synchronized void waxed() {
        waxOn = true; // Ready to buff
        System.out.println("waxed -> " + waxOn);
        notifyAll();
    }

    public synchronized void buffed() {
        waxOn = false; // Ready for another coat of wax
        System.out.println("buffed -> " + waxOn);
        System.out.println();
        notifyAll();
    }

    public synchronized void waitForWaxing()
            throws InterruptedException {
        System.out.println("waitForWaxing -> " + waxOn);
        while (waxOn == false)
            wait();
    }

    public synchronized void waitForBuffing()
            throws InterruptedException {
        System.out.println("waitForBuffing -> " + waxOn);
        while (waxOn == true)
            wait();
    }
}

class WaxOn implements Runnable {
    private Car1 car;

    public WaxOn(Car1 c) {
        car = c;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Wax On! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitForBuffing();
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax On task");
    }
}

class WaxOff implements Runnable {
    private Car1 car;

    public WaxOff(Car1 c) {
        car = c;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                car.waitForWaxing();
                System.out.println("Wax Off! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax Off task");
    }
}

public class WaxOMatic {
    public static void main(String[] args) throws Exception {
        Car1 car = new Car1();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOff(car));
        exec.execute(new WaxOn(car));
        TimeUnit.SECONDS.sleep(2); // Run for a while...
        exec.shutdownNow(); // Interrupt all tasks
    }
} /* Output: (95% match)
Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Exiting via interrupt
Ending Wax On task
Exiting via interrupt
Ending Wax Off task
*///:~
