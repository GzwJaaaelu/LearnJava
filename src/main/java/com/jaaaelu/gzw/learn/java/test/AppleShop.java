package com.jaaaelu.gzw.learn.java.test;

/**
 * 这种也叫泛型的实例化，把它变成了实在的信息
 */
public class AppleShop implements Shop<Apple> {

    @Override
    public Apple buy() {
        return null;
    }

    @Override
    public float refund(Apple item) {
        return 0;
    }
}
