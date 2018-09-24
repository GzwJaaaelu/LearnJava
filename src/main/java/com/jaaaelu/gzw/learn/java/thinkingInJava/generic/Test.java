package com.jaaaelu.gzw.learn.java.thinkingInJava.generic;



import com.jaaaelu.gzw.learn.java.thinkingInJava.rtti.Building;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        testGenericMethod();

        System.out.println();

        testNew();

        System.out.println();

        testClass();

        System.out.println();

        testGenericArray();

        System.out.println();

        testUnbounded();

        System.out.println();


    }

    private static void testUnbounded() {
        TestUnbounded testUnbounded = new TestUnbounded();
        testUnbounded.setMap(new HashMap<>());
        testUnbounded.setStringMap(new HashMap<>());
        testUnbounded.setMap(new HashMap<String, Integer>());
        testUnbounded.setStringMap(new HashMap<String, Integer>());
    }

    private static void testGenericArray() {
        GenericArray<Integer> ia = new GenericArray<>(10);
        ia.add(0, 1);
        ia.add(1, 2);

        GenericArray<String> sa = new GenericArray<>(10);
        sa.add(0, "one");
        sa.add(1, "two");

        System.out.println(ia);
        System.out.println(sa);

//        //  无法添加
//        GenericArray<? extends List> la = new GenericArray<>(10);
//        la.add(0, new ArrayList());

        //  这样就可以了
        GenericArray<? super List> la = new GenericArray<>(10);
        la.add(0, new ArrayList());

        System.out.println(la);
    }

    private static void testClass() {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println("c1 -> " + c1);
        System.out.println("c2 -> " + c2);
        System.out.println(c1 == c2);

        List<String> list = new ArrayList<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        Map<String, ? extends TestGenericMethod> map = new HashMap<>();
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
    }

    private static void testNew() {
        Map<TestGenericMethod, List<? extends Building>> map = New.map();

        //  这个例子在 Java 编程思想中，上面第一句是无法通过编译的，而下面那句才是正确的
        //  现在的 Java 版本中以及无需显式指出泛型类型，可以直接通过第一种方式就行代码编写，进行了简化
        f(New.map());
        f(New.<TestGenericMethod, List<? extends Building>>map());
    }

    private static void f(Map<TestGenericMethod, List<? extends Building>> map) {
        System.out.println(map);
    }


    private static void testGenericMethod() {
        TestGenericMethod genericMethod = new TestGenericMethod();
        genericMethod.f("Str");
        genericMethod.f(3.14);
        genericMethod.f(new TestGenericMethod());
    }
}

interface T<T> {

}

class TestTA implements T<String> {

}

////  这个是有问题的，不能通过编译
//class TestTAA extends TestTA implements T<Math> {
//
//}