package com.jaaaelu.gzw.learn.java.effectiveJava.enumerationAndAnnotation;

public enum TestEnum {
    A("A") {
        @Override
        void test() {
            System.out.println("Form A");
        }
    },
    B("B") {
        @Override
        void test() {
            System.out.println("Form B");
        }
    },
    C {
        @Override
        void test() {
            System.out.println("Form C");
        }

        @Override
        public void tt() {
            System.out.println("No Name");
        }
    };

    private final String Name;

    TestEnum(String name) {
        Name = name;
    }

    TestEnum() {
        Name = "Null";
    }

    public String getName() {
        return Name;
    }

    abstract void test();

    @Override
    public String toString() {
        return "TestEnum{" +
                "Name='" + Name + '\'' +
                '}';
    }

    public void tt() {
        System.out.println("Name -> " + Name);
    }
}
