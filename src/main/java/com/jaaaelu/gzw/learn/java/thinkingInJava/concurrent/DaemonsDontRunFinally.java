package com.jaaaelu.gzw.learn.java.thinkingInJava.concurrent;//: concurrency/DaemonsDontRunFinally.java
// Daemon threads don't run the finally clause

import java.util.concurrent.*;


class ADaemon implements Runnable {
    public void run() {
        try {
            System.out.print("Starting ADaemon");
            //  由于这里睡了 1 s，导致 finally 没法执行到就结束了，如果这里改为 0，那么 finally 就可以被执行到了
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.print("Exiting via InterruptedException");
        } finally {
            System.out.print("This should always run?");
        }
    }
}

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
} /* Output:
Starting ADaemon
*///:~
