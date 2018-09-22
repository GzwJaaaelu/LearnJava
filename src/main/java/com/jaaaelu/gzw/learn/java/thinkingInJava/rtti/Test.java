package com.jaaaelu.gzw.learn.java.thinkingInJava.rtti;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Test implements Iterable<String> {
    static final double PI = 3.14;

    static {
        System.out.println("Test static block");
    }

    public static void main(String[] args) {
        testClass();

        System.out.println();

        Iterable testClass = new TestClass();
        printInfo(testClass.getClass());

        System.out.println();

        testClassTypeTwo();

        System.out.println();

        testCast();
    }

    private static void testCast() {
        Building b = new House();
        Class<House> houseType = House.class;
        //  类型转换
        House h = houseType.cast(b);

        h = (House) b;

        Building realB = new Building();
        System.out.println(Building.class.isInstance(new House()));
    }

    private static void testClassTypeTwo() {
        System.out.println(Boolean.TYPE);
        System.out.println(boolean.class);
        System.out.println(Test.class);
        Class clazz = Test.class;
        System.out.println("--- --- ---");
        System.out.println(Test.PI);

        Class<? extends Number> numberClass = int.class;
        System.out.println(numberClass);
        numberClass = double.class;
        System.out.println(numberClass);
    }

    private static void printInfo(Class aClass) {
        System.out.println("Class getName: " + aClass.getName());
        System.out.println("Class isInterface: " + aClass.isInterface());
        System.out.println("Class getSimpleName: " + aClass.getSimpleName());
        System.out.println("Class getCanonicalName: " + aClass.getCanonicalName());
        System.out.println("Class getTypeName: " + aClass.getTypeName());
//        for (Method method : aClass.getMethods()) {
//            System.out.println("Class method: " + method.getName());
//        }
        for (Class clazz : aClass.getInterfaces()) {
            System.out.println("Class clazz: " + clazz.getName());
            System.out.println("Class isInterface: " + clazz.isInterface());
        }

        Class up = aClass.getSuperclass();
        try {
            Object ob = up.getConstructors()[0].newInstance();
            System.out.println(ob);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void testClass() {
        new Test();
        try {
            Class.forName("com.jaaaelu.gzw.learn.java.thinkingInJava.rtti.TestClass");

            Class.forName("com.jaaaelu.gzw.learn.java.thinkingInJava.rtti.A");

            Class.forName("com.jaaaelu.gzw.learn.java.thinkingInJava.rtti.TestClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}

class A {

    static {
        System.out.println("A static block");
    }

    public void test() {

    }
}
