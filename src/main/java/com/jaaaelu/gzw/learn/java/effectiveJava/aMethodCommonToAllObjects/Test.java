package com.jaaaelu.gzw.learn.java.effectiveJava.aMethodCommonToAllObjects;

public class Test {

    public static void main(String[] args) {
        if (new Test() instanceof Test) {
            System.out.println("test");
        }
        System.out.println("e");
    }
}
