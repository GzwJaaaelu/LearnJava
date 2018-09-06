package com.jaaaelu.gzw.learn.java.thinkingInJava.reuseClass.extendsTest;

public class TestF {
    private static final double PI;
    private final int Max;

    static {
        PI = 3.14;
    }

    private TestF() {
        System.out.println("TestF -> " + Max);
//        Max = 2;
    }

    {
        Max = 2;
    }

    public static class C extends TestF {

        public C() {
            System.out.println("C");
        }

        class InnerC {

            InnerC() {
                System.out.println("InnerC");
            }

        }
    }
}