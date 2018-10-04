package com.jaaaelu.gzw.learn.java.thinkingInJava.enumerationType;

import com.jaaaelu.gzw.learn.java.thinkingInJava.OSExecute;

import java.util.EnumSet;

public class Test {

    public static void main(String[] args) {
        testEnumBase();

        System.out.println();

        testEnumSet();
    }

    private static void testEnumSet() {
        EnumSet<Shrubbery> shrubberies = EnumSet.allOf(Shrubbery.class);
        System.out.println(shrubberies);
        shrubberies.remove(Shrubbery.TEST);
        System.out.println(shrubberies);
    }

    private static void testEnumBase() {
        System.out.println(Shrubbery.valueOf("GROUND"));
        System.out.println();
        for (Shrubbery value : Shrubbery.values()) {
            //  ordinal() 返回的是枚举的声明次序
            System.out.print(value.name() + "   " + value.ordinal() + " compareTo(Shrubbery.CRAWLING) -> ");
            System.out.println(value.compareTo(Shrubbery.CRAWLING));
            //  getDeclaringClass() 获取当前枚举所属的 enum 类
            System.out.println(value.getDeclaringClass());
            System.out.println(value == Shrubbery.CRAWLING);

            testSwitch(value);
            System.out.println("------------------------------");
        }

        Shrubbery.GROUND.test();
        Shrubbery.CRAWLING.test();
        Shrubbery.HANGING.test();
        Shrubbery.TEST.test();

        System.out.println();

        Enum e = Shrubbery.TEST;
//        for (Enum enumConstant : e.getClass().getEnumConstants()) {
//            System.out.println(enumConstant.name());
//        }

        System.out.println();

        for (Shrubbery.Test value : Shrubbery.Test.values()) {
            System.out.println(value.name());
        }

        System.out.println();

        for (Shrubbery value : Shrubbery.values()) {
            value.absTest();
        }
    }

    private static void testSwitch(Shrubbery value) {
        switch (value) {
            case GROUND:
                System.out.println("switch -> GROUND");
                break;
            case CRAWLING:
                System.out.println("switch -> CRAWLING");
                break;
            case HANGING:
                System.out.println("switch -> HANGING");
                break;
            case TEST:
                System.out.println("switch -> TEST");
                break;
        }
    }
}
