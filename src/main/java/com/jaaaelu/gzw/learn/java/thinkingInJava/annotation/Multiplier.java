package com.jaaaelu.gzw.learn.java.thinkingInJava.annotation;

@AptExtract("IMultiplier")
public class Multiplier {

    public int multiplier(int x, int y) {
        int total = 0;
        for(int i = 0; i < x; i ++) {
            total = add(total, y);
            System.out.println(total);
        }
        return total;
    }

    private int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("11 * 16 = " + new Multiplier().multiplier(11, 16));
    }
}
