package com.jaaaelu.gzw.learn.java.understandingTheJVM;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        new Test().test();
    }

    private void test() {
//        var ls = new ArrayList<String >();
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        //  true
        System.out.println(c == d);
        //  false
        System.out.println(e == f);
        //  ? true
        System.out.println(c == (a + b));
        //  true
        System.out.println(c.equals(a + b));
        //  false 错了，是 trueF
        System.out.println(g == (a + b));
        //  false
        System.out.println(g.equals(a + b));

        int c1 = 989;
        Object o = c1;
        c1 = (int)o;
        System.out.println(c1);
    }
}
