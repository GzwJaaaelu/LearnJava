package com.jaaaelu.gzw.learn.java.thinkingInJava.generic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GenericArray<T> {
    private T[] data;


    public GenericArray(int size) {
        //  创建泛型数组的方式
        data = (T[]) new Object[size];
    }

    public GenericArray(Class<T> type, int size) {
        //  创建泛型数组的方式
        data = (T[]) Array.newInstance(type, size);
    }

    @Override
    public String toString() {
        return Arrays.toString(data) + "    " + data.getClass().getSimpleName();
    }

    public void add(int index, T e) {
        data[index] = e;
    }

//    public void a(List<String> a) {}
//
//    public void a(List<HA> b) {}
}
