package com.jaaaelu.gzw.learn.java.test;

public interface Shop<T> {

    T buy();

    float refund(T item);
}
