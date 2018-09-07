package com.jaaaelu.gzw.learn.java.thinkingInJava.polymorphism;

public class Child extends Base {
    public static final double PI = Pi();

    private static double Pi() {
        System.out.println("Child Pi");
        return 3.14;
    }

    public int field = getSuperField();

    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child block");
    }

    public Child() {
        fun2();
        System.out.println("public Child()");
    }


    public static void testStatic() {
        System.out.println("Child testStatic");
    }

    @Override
    void fun2() {
        System.out.println("Child fun2");
    }

    public void testPrivate() {
        System.out.println("Child testPrivate");
    }

    public int getSuperField() {
        System.out.println("Child getSuperField");
        return super.field;
    }
}
