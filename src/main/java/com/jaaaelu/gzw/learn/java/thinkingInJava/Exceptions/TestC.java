package com.jaaaelu.gzw.learn.java.thinkingInJava.Exceptions;

public class TestC extends TestP {

    //  重写时抛出异常只能比父类声明的异常要小
    @Override
    public void p() throws NullPointerException {
        super.p();
    }
}
