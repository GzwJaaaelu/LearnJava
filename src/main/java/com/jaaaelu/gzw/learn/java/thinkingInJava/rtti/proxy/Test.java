package com.jaaaelu.gzw.learn.java.thinkingInJava.rtti.proxy;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        SomeMethods someMethods = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(),
                new Class[] {SomeMethods.class},
                new MethodSelector(new SomeImpl()));

        someMethods.boring1();
        someMethods.boring2();
        someMethods.interesting("learn");
    }
}
