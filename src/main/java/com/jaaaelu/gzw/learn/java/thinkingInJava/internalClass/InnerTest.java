package com.jaaaelu.gzw.learn.java.thinkingInJava.internalClass;

public class InnerTest {

    public InnerTest() {
        System.out.println("InnerTest");
    }

    class Inner {
        protected String info;

        public Inner(String info) {
            this.info = info;
            System.out.println("Inner info -> " + info);
        }

        public void print() {
            System.out.println("InnerTest.Inner -> " + info);
            //  访问外围类通过 外围类.this 的形式即可
            InnerTest.this.print();
        }
    }

    public Inner getIn(String info) {
        return new Inner(info);
    }

    private void print() {
        System.out.println("InnerTest print");
    }

    static class StaticInner {
        private String info;

        public StaticInner(String info) {
            this.info = info;
            System.out.println("StaticInner info -> " + info);
        }

        public void print() {
            System.out.println("InnerTest.StaticInner -> " + info);
//            //  由于不需要外部类对象引用，所以也就无法通过这种形式访问外部类
//            InnerTest.this.print();
        }
    }

    //  此时除了 InnerTest 内部没有人能够访问 AImpl
    //  而且此时也无法进行向下转型，因为不能访问该类的名字
    private class AImpl implements InterfaceA {

        @Override
        public void print() {
            System.out.println("print from AImpl");
        }
    }

    protected class OtherAImpl implements InterfaceA {

        public OtherAImpl() {
            System.out.println("OtherAImpl");
        }


        @Override
        public void print() {
            System.out.println("print from OtherAImpl");
        }
    }

    public InterfaceA getA() {
        return new AImpl();
    }

    public InterfaceA getInFunA() {
        //  方法中的内部类，也叫局部内部类
        class InFunA implements InterfaceA {

            public InFunA() {
                System.out.println("InFunA");
            }

            @Override
            public void print() {
                System.out.println("print from InFunA");

            }
        }
        return new InFunA();
    }

    //  在任意域内都可以创建内部类
    static {
        class YUA implements InterfaceA {

            @Override
            public void print() {

            }
        }
    }

    public InterfaceA getNewA() {
        //  匿名内部类
        return new InterfaceA() {

            @Override
            public void print() {
                System.out.println("print from getNewA");
            }
        };
    }

    public Inner getTest(String info, String test) {
        //  匿名内部类
        //  其实内部类相当于一个子类
        return new Inner(info) {
            private String t = test;

            {
                System.out.println("假装有构造 -> " + info);
            }

            {
                System.out.println("继续假装有构造 -> " + info);
            }

            @Override
            public void print() {
                System.out.println("print from getTest -> " + test);
            }

            //  其实无法调用到
            //  由于向上转型，所以子类的特性是无法访问到的
            public void test() {
                System.out.println("test");
            }
        };

    }
}
