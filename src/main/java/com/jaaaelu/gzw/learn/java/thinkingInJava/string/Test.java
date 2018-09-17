package com.jaaaelu.gzw.learn.java.thinkingInJava.string;

public class Test {

    public static void main(String[] args) {
        testAppend();

        System.out.println();

        System.out.println(new Test());

        System.out.println();

        testPrintf();

        System.out.println();

        testRegular();
    }

    private static void testRegular() {
        System.out.println("可能有一个负号，后面跟着一位或多位数字：");
        System.out.println("-123 -> " + "-123".matches("-?\\d+"));
        System.out.println("123 -> " + "123".matches("-?\\d+"));
        System.out.println("+123 -> " + "+123".matches("-?\\d+"));
        System.out.println("可能有一个负号或一个正号，后面跟着一位或多位数字：");
        System.out.println("-999 -> " + "-999".matches("([-+])?\\d+"));
        System.out.println("999 -> " + "999".matches("([-+])?\\d+"));
        System.out.println("+999 -> " + "+999".matches("([-+])?\\d+"));
    }

    private static void testPrintf() {
        System.out.format("Row 1：[%d %f]\n", 2, 3f);

    }

    private static void testAppend() {
        System.out.println("a " + "b " + "c " + 123);
        String mango = "mango";
        String s = "abc " + mango + " def " + 47;
        System.out.println(s);
    }

    @Override
    public String toString() {
//        //  这样会导致 StackOverflowError
//        return "add -> " + this;
        //  这样才是正确的在 toString() 中打印对象地址的做法
        return "add -> " + super.toString();
    }
}
