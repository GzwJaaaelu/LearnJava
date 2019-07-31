package com.jaaaelu.gzw.learn.java.understandingTheJVM;

import java.io.InputStream;

public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    System.out.println(fileName);
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (Exception e) {
                    throw new ClassNotFoundException();
                }
            }
        };

        try {
            Object o = myLoader.loadClass("com.jaaaelu.gzw.learn.java.understandingTheJVM.ClassLoaderTest").newInstance();
            System.out.println(o.getClass().getName());
            System.out.println(o instanceof com.jaaaelu.gzw.learn.java.understandingTheJVM.ClassLoaderTest);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
