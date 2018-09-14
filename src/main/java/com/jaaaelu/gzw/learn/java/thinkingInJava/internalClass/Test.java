package com.jaaaelu.gzw.learn.java.thinkingInJava.internalClass;

public class Test {

    public static void main(String[] args) {
        InnerTest test = new InnerTest();
        InnerTest.Inner inner;
        System.out.println(inner = test.new Inner("From New"));
        inner.print();
        System.out.println(inner = test.getIn("From Fun"));
        inner.print();

        System.out.println();

        InnerTest.StaticInner staticInner = new InnerTest.StaticInner("Static Inner");
        staticInner.print();

        System.out.println();

        test.getA().print();

//        //  无法访问
//        InnerTest.AImpl

        System.out.println();

        TestOtherA otherA = new TestOtherA(test);
        otherA.print();

        System.out.println();

        test.getInFunA().print();

        System.out.println();

        test.getNewA().print();

        System.out.println();

        test.getTest("getTest", "se").print();

        System.out.println();

        new InterfaceA.TestInInterface().print();
    }

//    class TestOtherA extends InnerTest.OtherAImpl {
//
//
//        public TestOtherA (InnerTest test) {
//            //  如果主动加上这一行，无法继承内部类
//            test.super();
//        }
//    }
}
