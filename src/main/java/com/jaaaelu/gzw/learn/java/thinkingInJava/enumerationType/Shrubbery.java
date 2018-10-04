package com.jaaaelu.gzw.learn.java.thinkingInJava.enumerationType;

import com.jaaaelu.gzw.learn.java.thinkingInJava.generic.A;

public enum Shrubbery implements A {

    GROUND {

        @Override
        void absTest() {
            System.out.println("absTest from GROUND");
        }
    },
    CRAWLING {

        //  虽然能这么写但是调用不到
        public void c() {
            System.out.println("c???");
        }

        @Override
        void absTest() {
            System.out.println("absTest from CRAWLING");
        }
    },
    HANGING() {

        @Override
        void absTest() {
            System.out.println("absTest from HANGING");
        }
    },
    TEST("我描述我自己") {

        @Override
        void absTest() {
            System.out.println("absTest from TEST");
        }
    };

    enum Test {
        T1,
        T2;
    }

    private String desc;

    Shrubbery(String desc) {
        this.desc = desc;
    }

    Shrubbery() {

    }

    abstract void absTest();

    public void test() {
        System.out.println("Method in Enum -> " + this);
    }

    @Override
    public String toString() {
        return super.toString() + " " + (desc == null ? "" : desc);
    }

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }
}
