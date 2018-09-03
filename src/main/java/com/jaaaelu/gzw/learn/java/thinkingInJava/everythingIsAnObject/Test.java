package com.jaaaelu.gzw.learn.java.thinkingInJava.everythingIsAnObject;

import java.util.Date;

/**
 * @author Gzw
 * @version 1.0
 * @since 2018 - 07 - 12
 */
public class Test {

    public static void main(String[] args) {
//        String str = new String("Gzw");
//        testString(str);
//        System.out.println("main -> " + str);

        System.out.println("Hello, it's: ");
        System.out.println(new Date());

        System.out.println();

        testE2_1();

        System.out.println();

        testE2_2();

        System.out.println();

        testE2_8();
    }

    private static void testE2_8() {
        E2_8 e280 = new E2_8();
        System.out.println("e280 s -> " + e280.s);
        E2_8 e281 = new E2_8();
        System.out.println("e281 s -> " + e281.s);
        E2_8 e282 = new E2_8();
        System.out.println("e282 s -> " + e282.s);
        E2_8 e283 = new E2_8();
        System.out.println("e283 s -> " + e283.s);

        E2_8.s = 5;
        System.out.println("E2_8.s 被修改");

        System.out.println("e280 s -> " + e280.s);
        System.out.println("e281 s -> " + e281.s);
        System.out.println("e282 s -> " + e282.s);
        System.out.println("e283 s -> " + e283.s);
    }

    private static void testE2_2() {
        System.out.println("Hello, World");
    }

    private static void testE2_1() {
        E2_1 e21 = new E2_1();
        System.out.println("boolean 默认值为 -> " + e21.bo);
        System.out.println("char    默认值为 -> " + e21.c);
        System.out.println("byte    默认值为 -> " + e21.by);
        System.out.println("short   默认值为 -> " + e21.s);
        System.out.println("int     默认值为 -> " + e21.i);
        System.out.println("long    默认值为 -> " + e21.l);
        System.out.println("float   默认值为 -> " + e21.f);
        System.out.println("double  默认值为 -> " + e21.d);
    }

    /**
     * @param str 需要进行测试的字符串值
     */
    public static void testString(String str) {
        str = new String("a");
        System.out.println("testString -> " + str);
    }

    /**
     * @deprecated
     */
    public static void testString() {
    }
}
