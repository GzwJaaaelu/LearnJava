package com.jaaaelu.gzw.learn.java.thinkingInJava.initializationAndCleanup;

public class Book {
    boolean checkedOut = false;

    Book() {}

    public Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("finalize");
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }
}
