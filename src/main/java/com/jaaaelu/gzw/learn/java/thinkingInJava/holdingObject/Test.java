package com.jaaaelu.gzw.learn.java.thinkingInJava.holdingObject;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        testList();

        System.out.println();

        testIterator();

        System.out.println();

        testStack();

        System.out.println();

        testForeach();
    }

    private static void testForeach() {
        ReversibleArrayList<String> reversibleArrayList = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));

        //  这里得到（默认的）向前的迭代器
        for (String s : reversibleArrayList) {
            System.out.print(s + " ");
        }

        System.out.println();

        //  这里得到自定义的反向的迭代器
        for (String s : reversibleArrayList.reversed()) {
            System.out.print(s + " ");
        }
    }

    private static void testStack() {
        MyStack<String> myStack = new MyStack<>();
        myStack.psuh("A");
        myStack.psuh("B");
        myStack.psuh("C");

        System.out.println(myStack.size());

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

    private static void testIterator() {
        List<String> pets = new ArrayList<>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Test");

        Iterator<String> it = pets.iterator();

        System.out.println(pets);

        while (it.hasNext()) {
            String p = it.next();
            System.out.println(p);
//            //  在迭代器遍历过程中，无法使用 list 的 remove 方法，需要使用迭代器的 remove 方法
//            pets.remove(p);
            it.remove();
        }

        System.out.println(pets);

        pets.add("Dog");
        pets.add("Cat");
        pets.add("Test");

        System.out.println(pets);

        ListIterator<String> lIt = pets.listIterator();

        lIt.add("lIt");

        while (lIt.hasNext()) {
            String p = lIt.next();
            System.out.println(p);
//            //  在迭代器遍历过程中，无法使用 list 的 remove 方法，需要使用迭代器的 remove 方法
//            pets.remove(p);
            lIt.set(p + " Mod");
        }

        System.out.println(pets);
    }

    private static void testList() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        //  通过 Arrays.asList 创建的 List 无法调用 add() 或 remove() 方法
        //  因为这种情况下，其底层表示的是数组，因此不能调整尺寸。
//        integers.add(6);
//        integers.remove(1);
        System.out.println(integers);

        System.out.println();

        List<Snow> snow1 = Arrays.asList(new Powder(), new Crusty());

        System.out.println();

        List<Snow> snow2 = Arrays.asList(new Light(), new Heady());
    }

    static class Snow {
    }

    static class Powder extends Snow {
    }

    static class Light extends Powder {
    }

    static class Heady extends Powder {
    }

    static class Crusty extends Snow {
    }

    static class Slush extends Snow {
    }
}
