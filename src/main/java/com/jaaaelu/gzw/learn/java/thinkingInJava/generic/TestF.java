package com.jaaaelu.gzw.learn.java.thinkingInJava.generic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class TestF<T extends HasF & A & Comparable> {
    T t;

    public TestF(T t, Class<T> tClass) {
        this.t = t;

//        //  无法直接 new
//        T ts = new T();

        ;
        try {
            T ts = tClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void testF() {
//        //  如果 TestF 的泛型类型为 <T>，则无法编译
//        t.f();

        //  如果 TestF 的泛型类型为 <T extends HasF>，则可以调用到 f()
        t.f();
        t.g();
        t.z();
    }
}

class TestOther<T extends HasF & A> extends ArrayList<T> {
    T t;


    public void test() {
        t.z();
        t.g();
        t.f();
    }
}

class HA extends HasF implements A, Comparable {

    @Override
    public void g() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
