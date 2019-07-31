package com.jaaaelu.gzw.learn.java.test;

/**
 * 这里的泛型类型名称可以是 T，可以 E，也可以是其他的，但尽量不要和其它类名重合，不然自己用其他类的时候，要写全路径才行
 *
 * T 的作用其实是标记符号，并且只有在类或接口内部有效，继承或实现时也要需要在当前类或接口声明出泛型
 *
 * 记住只在当前类有用，要想在实现中也使用类型参数，就要写两处，或者像是 AppleShop 一样，直接指明我要将类型参数实例化成什么
 *
 * 泛型参数只是一个内部代号，目的是为了使用到它是统一
 *
 * @param <T>
 */
public interface RepairableShop<T> extends Shop<T> {

    void repair(T item);
}
