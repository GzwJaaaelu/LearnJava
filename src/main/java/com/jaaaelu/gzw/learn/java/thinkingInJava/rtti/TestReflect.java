package com.jaaaelu.gzw.learn.java.thinkingInJava.rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    private String name;
    protected String sex;
    public int age;

    private TestReflect() {

    }

    public TestReflect(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public TestReflect(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void info() {
        System.out.println("private info");
    }

    public TestReflect getThis() {
        return this;
    }

    public static void main(String[] args) {
        Class<TestReflect> clazz = TestReflect.class;

        //  getConstructors() getMethods() getFields() 只会返回 public 的

        for (Constructor<?> constructor : clazz.getConstructors()) {
            System.out.println(constructor);
        }

        System.out.println();

        for (Method method : clazz.getMethods()) {
            System.out.println(method);
        }

        System.out.println();

        for (Field field : clazz.getFields()) {
            System.out.println(field);
        }

        try {
            //  通过反射的方式访问私有字段
            Field field = clazz.getDeclaredField("name");
//            //  这样是不行的
//            Field field = clazz.getField("name");
            System.out.println(field.getName());

            //  通过反射的方式访问私有方法
            Method method = clazz.getDeclaredMethod("info");
            method.setAccessible(true);
            method.invoke(new TestReflect());
        } catch (NoSuchFieldException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
