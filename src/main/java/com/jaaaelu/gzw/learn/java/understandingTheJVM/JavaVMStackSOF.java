package com.jaaaelu.gzw.learn.java.understandingTheJVM;

public class JavaVMStackSOF {

    private int stackLength = 1;

    private void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("stack length -> " + oom.stackLength);
        }
    }
}
