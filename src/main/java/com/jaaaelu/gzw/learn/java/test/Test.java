package com.jaaaelu.gzw.learn.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //  什么时候会被逼着写这样的代码呢？
        List<? extends Fruit> fruits = new ArrayList<Apple>();
//        fruits.add(new Banana());
//        fruits.add(new Apple());
//        fruits.add(new Fruit());

        List<Fruit> fruitList = new ArrayList<>();
        List<Apple> apples = new ArrayList<>();
        List<Banana> bananas = new ArrayList<>();
        printFruitsName(apples);
        printFruitsName(bananas);

//        List<Fruit> fruitList = (ArrayList) new ArrayList<Apple>();
//        fruitList.add(new Banana());
//        List<Apple> appleList = new ArrayList<>();
//        List<Fruit> fruitList = (ArrayList) appleList;
//        fruitList.add(new Banana());
//        Apple apple = appleList.get(0);

//        Fruit[] fruitsArr = new Apple[10];
//        fruitsArr[0] = new Banana();

        List<? super Apple> appleList = new ArrayList<Fruit>();
        appleList.add(new Apple());

        Apple apple = new Apple();
        apple.addAppleToList(fruitList);


        List<Apple> as = new ArrayList();
        as.add(new Apple());

//        String[] oArr = new String[3];
//        oArr[0] = "1";
//        oArr[1] = 1;

//        List<String[]> sl = new ArrayList<>();
////        sl.add(new String[]{"a", "b", "c"});
////        System.out.println(Arrays.toString(sl.get(0)));

        List<?>[] lists = new ArrayList<?>[10];
//        ArrayList<String>[] edges = new ArrayList<String>[10];

        List<String> strList = new ArrayList<String>();
        strList.add("a");
//        strList.add(123);
    }

    public static void printFruitsName(List<? extends Fruit> fruits) {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
    }

    public <F> F findFood() {
        return (F) new Object();
    }
}
