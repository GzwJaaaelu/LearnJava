package com.jaaaelu.gzw.learn.java.test;

import java.util.List;

public class Apple extends Fruit {

    @Override
    protected String getName() {
        return "apple";
    }

    public void addAppleToList(List<? super Apple> apples) {
        apples.add(this);
    }
}
