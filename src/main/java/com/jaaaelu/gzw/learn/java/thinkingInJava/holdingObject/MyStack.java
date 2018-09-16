package com.jaaaelu.gzw.learn.java.thinkingInJava.holdingObject;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void psuh(T t) {
        linkedList.addFirst(t);
    }

    public T peek() {
        return linkedList.peek();
    }

    public T pop() {
        return linkedList.poll();
    }

    public boolean isEmpty() {
        return 0 == linkedList.size();
    }

    public int size() {
        return linkedList.size();
    }
}
