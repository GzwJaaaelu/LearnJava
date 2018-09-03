package com.jaaaelu.gzw.learn.java.thinkingInJava.initializationAndCleanup;

import java.util.Arrays;

public class Test {

    public static void main(String...args) {
        testRock();

        System.out.println();

        testBook();

        System.out.println();

        testStaticString();

        System.out.println();

        testArray();

        System.out.println();

        testArgs(1, 'c', 2, ' ', 3);

        System.out.println();

        testEnum();
    }

    private static void testEnum() {
        EnumDemo enumDemo = EnumDemo.HOT;
        EnumDemo enumDemo2 = EnumDemo.HOT;
        System.out.println(enumDemo.name());
        System.out.println(enumDemo.ordinal());

        System.out.println(enumDemo == enumDemo2);
    }

    private static void testArgs(int...ints) {
        System.out.println(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }

        System.out.println();
    }

    private static void testArray() {
        InitializeTest[] initializeTests = new InitializeTest[3];
        System.out.println(Arrays.toString(initializeTests));

        System.out.println();

        int[] numbers = {1, 2, 3};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] intArray = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(numbers));
    }

    private static void testStaticString() {
        new InitializeTest();
    }

    private static void testBook() {
        Book novel = new Book(true);
//        novel.checkIn();
        System.gc();
    }

    private static void testRock() {
        Rock r = new Rock();
        System.out.println("r.testStr -> " + r.testStr);
        System.out.println("r.testInitStr -> " + r.testInitStr);

        System.out.println();

        Rock initRWithStr = new Rock("Rock");
        System.out.println("initRWithStr.testStr -> " + initRWithStr.testStr);
        System.out.println("initRWithStr.testInitStr -> " + initRWithStr.testInitStr);
        initRWithStr.rock();
        initRWithStr.rock(10);
    }
}
