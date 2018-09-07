package com.jaaaelu.gzw.learn.java.thinkingInJava.polymorphism;

public class Base {
    public static final double PI = Pi();

    private static double Pi() {
        System.out.println("Base Pi");
        return 3.14;
    }

    static {
        System.out.println("Base static block");
    }

    public int field = 5;
    public int test = test();

    public int test() {
        System.out.println("Base test");
        return 2;
    }

    {
        System.out.println("Base block");
    }

    public Base() {
        this.fun2();
        fun2();
        System.out.println("public Base()");
    }

    public static void testStatic() {
        System.out.println("Base testStatic");
    }

    void fun1() {
        System.out.println("Base fun1");
        fun2();
    }

    void fun2() {
        System.out.println("Base fun2");
    }

    private void testPrivate() {
        System.out.println("Base testPrivate");
    }

    public static void main(String[] args) {
        Base base = new Child();
        System.out.println();
        base.testPrivate();
        ((Child) base).testPrivate();
        System.out.println();
        System.out.println(base.field);
        System.out.println(((Child) base).field);
        System.out.println();
        base.testStatic();
        ((Child) base).testStatic();
    }
}
