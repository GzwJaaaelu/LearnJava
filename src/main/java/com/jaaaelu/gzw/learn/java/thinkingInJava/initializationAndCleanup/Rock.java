package com.jaaaelu.gzw.learn.java.thinkingInJava.initializationAndCleanup;

public class Rock {
    String testStr;
    String testInitStr;

    Rock() {
        System.out.println("Rock 初始化");
        testInitStr = "testInitStr";
    }

    Rock(String str) {
        System.out.println("Rock 初始化 -> " + str);
        testInitStr = str;
    }

    public void rock() {
        System.out.println("rock rock rock !");
    }

    public void rock(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("rock").append(" ");
        }
        sb.append("!");
        System.out.println(sb.toString());
    }

//    //  无法通过返回值来区分方法
//    public void rockInfo() {
//        System.out.println("void rockInfo()");
//    }
//
//    public String rockInfo() {
//        System.out.println("String rockInfo()");
//        return testInitStr;
//    }
}
