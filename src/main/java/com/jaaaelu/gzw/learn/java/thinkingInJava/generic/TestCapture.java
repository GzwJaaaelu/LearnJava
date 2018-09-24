package com.jaaaelu.gzw.learn.java.thinkingInJava.generic;

public class TestCapture {

    static <T> void f1(Holder<T> holder) {
        T t = holder.getT();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder holder = new Holder<Integer>();
        holder.setT(1);
        f2(holder);
        f1(holder);
        Holder holder1 = new Holder();
        holder1.setT(new HasF());
        f2(holder1);
        f1(holder1);
        holder1.setT(new Object());
        f2(holder1);
        f1(holder1);
        Holder<?> holder2 = new Holder<Double>(1.0);
        f2(holder2);
        f1(holder2);
    }
}

class Holder<T> {
    T t;

    public Holder() {

    }

    public Holder(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
