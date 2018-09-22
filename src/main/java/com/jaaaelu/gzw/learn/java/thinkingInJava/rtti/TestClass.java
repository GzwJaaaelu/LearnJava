package com.jaaaelu.gzw.learn.java.thinkingInJava.rtti;

public class TestClass extends Test implements Cloneable, Comparable<String> {

    static {
        System.out.println("TestClass static block");
    }

    {
        System.out.println("TestClass block");
    }

    TestClass() {
        System.out.println("TestClass()");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
