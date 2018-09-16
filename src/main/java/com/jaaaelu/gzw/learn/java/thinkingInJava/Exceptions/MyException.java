package com.jaaaelu.gzw.learn.java.thinkingInJava.Exceptions;

public class MyException extends Exception {

    MyException() {
        super();
    }

    MyException(String info) {
        super(info);
    }

    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException("抛出异常");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }

        System.out.println("main");

        System.out.println(1 + 1);

        throw new RuntimeException();
    }
}
