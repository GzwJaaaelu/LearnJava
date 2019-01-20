package com.jaaaelu.gzw.learn.java.effectiveJava.enumerationAndAnnotation;

public class Test {

    public static void main(String[] args) {
        System.out.println(TestEnum.A.compareTo(TestEnum.B));;
        System.out.println();
        System.out.println(TestEnum.valueOf("A"));
        System.out.println();
//        //  会直接抛异常
//        System.out.println(TestEnum.valueOf("D"));
        for (TestEnum value : TestEnum.values()) {
            System.out.println(value);
            System.out.println(value.getName());
            value.test();
            value.tt();
            System.out.println(value.ordinal());
            System.out.println();
        }
    }
}
