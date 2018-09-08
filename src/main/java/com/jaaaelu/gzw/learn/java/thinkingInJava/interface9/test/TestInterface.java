package com.jaaaelu.gzw.learn.java.thinkingInJava.interface9.test;

public interface TestInterface {
    double PI = 3.14;

    void a();

    void z();
}

interface A {
    void a();
}

interface B extends A {
    void b();
}

interface C {
    void c();
}

interface D extends B, C {
    void d();
}

interface E extends D {
    void e();
}

class T implements E{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void e() {

    }
}