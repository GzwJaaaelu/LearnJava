package com.jaaaelu.gzw.learn.java.test;

public class NoStaticFieldGenerics<V> {

//    public static V staticGenericFiled;
//
//    public static void staticGetValue() {
//        getValue();
//    }

    private V value;


    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
