package com.jaaaelu.gzw.learn.java.thinkingInJava.javaIO;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String adds;
    private transient String phone;
    private String sex;

    public Person(String name, String adds, String phone, String sex) {
        this.name = name;
        this.adds = adds;
        this.phone = phone;
        this.sex = sex;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adds='" + adds + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
