package com.jaaaelu.gzw.learn.java.thinkingInJava.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        testInit();
    }

    private static void testInit() {
        int[] numbers;
//        //  数组在未初始化之前编译器不允许此引用做任何事情。
//        System.out.println(numbers[0]);

        int[] a1 = new int[1];
        int[] a2 = {1, 2, 3};
        int[] a3 = new int[]{4, 5};

        int[][] aa1 = {{1, 2, 3}, {1, 2}, {1}};
        System.out.println(Arrays.deepToString(aa1));

        int[][][] aa2 = new int[2][3][5];
        System.out.println(Arrays.deepToString(aa2));

        int[][][] aa3 = new int[2][][];
        System.out.println(Arrays.deepToString(aa3));

        List<String>[] la = (List<String>[]) new List[10];
        la[0] = new ArrayList<>();

        System.out.println(Arrays.deepToString(la));
    }
}
