package com.jaaaelu.gzw.learn.java.understandingTheJVM;

public class RuntimeContstantPoolOOM {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//
//        int i = 0;
//        while (true) {
//            list.add(String.valueOf(i).intern());
//        }

//        String s1 = new StringBuilder("计算机").append("技术").toString();
////        System.out.println(s1.intern() == s1);
////
////        String s2 = new StringBuilder("jav").append("a").toString();
////        System.out.println(s2.intern() == s2);

        System.out.println("hello");
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        ThreadGroup topGroup = group;
        while (group != null) {
            topGroup = group;
            group = group.getParent();

        }

        Thread[] threads = new Thread[topGroup.activeCount()];
        topGroup.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }


//        Thread thread = new Thread();
//        thread.start();
//        thread.start();
    }
}
