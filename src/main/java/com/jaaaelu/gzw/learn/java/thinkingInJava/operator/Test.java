package com.jaaaelu.gzw.learn.java.thinkingInJava.operator;

import static com.jaaaelu.gzw.learn.java.thinkingInJava.operator.Print.print;

public class Test {

    public static void main(String[] args){
        testPrint();

        System.out.println();

        testPlus();

        System.out.println();

        testLetter();

        System.out.println();

        testEquivalence();

        System.out.println();

        testDog();

        System.out.println();

        testTypeCast();
    }

    private static void testTypeCast() {

        long l = Long.MAX_VALUE;
        int i = (int) l;
        System.out.println(i == Integer.MAX_VALUE);
        System.out.println(i);

        System.out.println("29.7 -> int: " + (int)29.7);
        //  Math.round 四舍五入了
        System.out.println("29.7 -> Math.round: " + Math.round(29.7));
        System.out.println("29.4 -> Math.round: " + Math.round(29.4));

        short a = 10;
        short b = (short) (a * a);
        System.out.println(b);
    }

    private static void testDog() {
        Dog d1 = new Dog("spot", "Ruff!");
        Dog d2 = new Dog("scruffy", "Wurf!");
        Dog d3 = new Dog("scruffy", "Wurf!");
        printDogInfo(d1);
        printDogInfo(d2);
        System.out.println("d1 == d2 -> " + (d1 == d2));
        System.out.println("d1.equals(d2) -> " + (d1.equals(d2)));

        System.out.println("d3 == d2 -> " + (d3 == d2));
        System.out.println("d3.equals(d2) -> " + (d3.equals(d2)));
    }

    private static void printDogInfo(Dog dog) {
        System.out.println("This dog name is -> " + dog.name);
        System.out.println("This dog sya -> " + dog.says);
    }

    private static void testEquivalence() {
        Integer i1 = new Integer(47);
        Integer i2 = new Integer(47);
        System.out.println("i1 == i2 -> " + (i1 == i2));
        System.out.println("i1.equals(i2) -> " + (i1.equals(i2)));
        i1 = i2 = 12;
        System.out.println("i1 == i2 -> " + (i1 == i2));
        System.out.println("i1.equals(i2) -> " + (i1.equals(i2)));
    }

    private static void testLetter() {
        Letter x = new Letter();
        x.c = 'a';
        x.size = 'a';
        print("1: x.c: " + x.c);
        print("1: x.size: " + x.size);
        f(x);
        print("2: x.c: " + x.c);
        print("2: x.size: " + x.size);
    }

    private static void f(Letter y) {
        y.c = 'z';
        y.size = 'z';
    }

    private static void testPlus() {
        System.out.println(1 + "a");
        System.out.println(1 + 2 + "a");
        System.out.println(1 + 'a');
        System.out.println("a" + 1 + 2);
        System.out.println('a' + 1);
    }

    private static void testPrint() {
        System.out.println("正常打印");
        print("简短打印");
    }
}
