package com.jaaaelu.gzw.learn.java.thinkingInJava.operator;

public class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            return this.name.equals(((Dog) obj).name) && this.says.equals(((Dog) obj).says);
        }
        return false;
    }
}
