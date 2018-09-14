package com.jaaaelu.gzw.learn.java.thinkingInJava.internalClass;

public interface InterfaceA {

    void print();

    class TestInInterface implements InterfaceA {

        @Override
        public void print() {
            System.out.println("Form TestInInterface");
        }
    }
}
