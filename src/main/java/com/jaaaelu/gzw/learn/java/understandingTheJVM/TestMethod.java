package com.jaaaelu.gzw.learn.java.understandingTheJVM;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

public class TestMethod {

    public static void main(String[] args) {
        (new TestMethod()).new S().thinking();
        (new TestMethod().new S()).thinking();
    }

    class GF {
        void thinking() {
            System.out.println("I am SGF");
        }
    }

    class F extends GF {

        void thinking() {
            System.out.println("I am F");
        }
    }

    class S extends F {

        @Override
        void thinking() {
            //  这里如何调用祖父类中的 thinking？
            try {
                MethodType mt = MethodType.methodType(void.class);
                MethodHandle mh = lookup().findSpecial(GF.class, "thinking", mt, getClass());
                mh.invoke(this);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }

//            super.thinking();
        }
    }
}
