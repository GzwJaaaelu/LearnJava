package com.jaaaelu.gzw.learn.java.thinkingInJava.reuseClass.extendsTest;

public class Test {

    public static void main(String[] args) {
        createC();
    }

    private static void createC() {
        TestF c1 = new TestF.C();

        TestF.C c2 = new TestF.C();

        TestF.C.InnerC innerC = c2.new InnerC();
    }
}
