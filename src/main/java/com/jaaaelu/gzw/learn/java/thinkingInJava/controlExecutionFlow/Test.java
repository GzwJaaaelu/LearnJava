package com.jaaaelu.gzw.learn.java.thinkingInJava.controlExecutionFlow;

public class Test {

    public static void main(String[] args) {
        testFor();

        System.out.println();

        testForeach();

        System.out.println();

        testFibonacci();
    }

    private static void testFibonacci() {
        int last = 0;
        int curr = 1;
        for (int i = 1; i < 10; i++) {
            System.out.print(curr + "   ");
            int temp = last + curr;
            last = curr;
            curr = temp;
        }
    }

    private static void testForeach() {
        int[] array = Range.range(10);
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }

    private static void testFor() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + 1 + "  ");
        }
    }
}
