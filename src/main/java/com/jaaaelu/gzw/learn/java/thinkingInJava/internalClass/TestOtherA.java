package com.jaaaelu.gzw.learn.java.thinkingInJava.internalClass;

public class TestOtherA extends InnerTest.OtherAImpl {


    public TestOtherA (InnerTest test) {
        //  如果不主动加上这一行，无法继承内部类
        test.super();
        System.out.println("TestOtherA");
    }
}

class TestOtherB extends InnerTest {

    //  上面的需要自己主动调用外围类的构造
    //  这个类不需要
    //  但是由于 TestB 的外围类继承自 OtherAImpl 的外围类 InnerTest，所以 TestB 可以访问到 TestOtherB，而 TestOtherB 要正确初始化
    //  也一定需要调用 InnerTest 的构造器
    class TestB extends OtherAImpl {

    }
}