package com.jaaaelu.gzw.learn.java.thinkingInJava.rtti.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MethodSelector implements InvocationHandler {
    private SomeMethods methods;

    public MethodSelector(SomeMethods methods) {
        this.methods = methods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy);
        System.out.println();
        if ("interesting".equals(method.getName())) {
            System.out.println("invoke interesting");
        }
        return method.invoke(methods, args);
    }
}
