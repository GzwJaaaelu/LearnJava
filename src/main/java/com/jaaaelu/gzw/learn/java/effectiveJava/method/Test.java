package com.jaaaelu.gzw.learn.java.effectiveJava.method;

public class Test {

    public static void main(String[] args) {
        test(null);
    }

    private static void test(String o) {
        assert o != null;
        assert false;
        assert true;
        System.out.println("Test");
    }
}
