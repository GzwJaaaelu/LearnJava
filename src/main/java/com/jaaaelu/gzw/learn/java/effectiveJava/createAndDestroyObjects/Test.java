package com.jaaaelu.gzw.learn.java.effectiveJava.createAndDestroyObjects;

public class Test {

    public static void main(String[] args) {
        testSum();
    }

    private static void testSum() {
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        //  如果是 Long 最终时间维持在 5000+，如果是 long 维持在 1000 上下
        System.out.println(System.currentTimeMillis() - start);
    }
}
