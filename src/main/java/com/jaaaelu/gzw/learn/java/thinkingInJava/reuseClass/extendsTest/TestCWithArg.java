package com.jaaaelu.gzw.learn.java.thinkingInJava.reuseClass.extendsTest;

public class TestCWithArg extends TestFWithArg {

    public TestCWithArg(String name) {
        //  一定需要调用父类构造确保父类七正确初始化
        //  如果父类有默认构造器就不用显式声明，反之这个例子就是需要显式调用基类构造器的
        //  并且基类构造器的调用必须是在第一行才行
        //  System.out.println("");
        super(name);
    }
}
