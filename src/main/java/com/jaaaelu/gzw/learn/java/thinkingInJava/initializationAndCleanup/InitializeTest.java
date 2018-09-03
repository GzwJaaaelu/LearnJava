package com.jaaaelu.gzw.learn.java.thinkingInJava.initializationAndCleanup;

public class InitializeTest {
    static String s1 = "s1";
    static String s2;

    int i1 = 1;
    int i2;

    static {
        System.out.println("s1 -> " + s1);
        System.out.println("s2 -> " + s2);

        s2 = "s2";

        System.out.println("s1 -> " + s1);
        System.out.println("s2 -> " + s2);

        System.out.println();
    }

    {
        System.out.println("i1 -> " + i1);
        System.out.println("i2 -> " + i2);

        i2 = 2;

        System.out.println("i1 -> " + i1);
        System.out.println("i2 -> " + i2);

        System.out.println();
    }

    InitializeTest() {
        System.out.println("InitializeTest");

        i2 = 3;

        System.out.println();

        System.out.println("i1 -> " + i1);
        System.out.println("i2 -> " + i2);
    }
}
