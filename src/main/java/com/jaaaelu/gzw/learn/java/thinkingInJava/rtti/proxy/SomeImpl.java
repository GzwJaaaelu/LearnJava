package com.jaaaelu.gzw.learn.java.thinkingInJava.rtti.proxy;

public class SomeImpl implements SomeMethods {

    @Override
    public void boring1() {
        System.out.println("boring1");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public void interesting(String someThing) {
        System.out.println("interesting -> " + someThing);
    }
}
