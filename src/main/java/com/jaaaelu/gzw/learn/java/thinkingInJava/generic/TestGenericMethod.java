package com.jaaaelu.gzw.learn.java.thinkingInJava.generic;

import java.util.Arrays;

public class TestGenericMethod {

    public <T> void f(T t) {
        System.out.println("T -> " + t);
        System.out.println("T -> " + t.getClass().getSimpleName());
        System.out.println();
    }

    public <T> void g(T...args) {
        System.out.println("T -> " + Arrays.toString(args));
        System.out.println("T -> " + args.getClass().getSimpleName());
        System.out.println();
    }
}
