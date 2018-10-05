package com.jaaaelu.gzw.learn.java.thinkingInJava.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 注解处理器
 */
public class UseCaseTracker {

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 1, 2, 3);
        trackUseCases(useCases, UseCaseTest.class);
    }

    private static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method declaredMethod : cl.getDeclaredMethods()) {
            UseCase uc = declaredMethod.getAnnotation(UseCase.class);
            System.out.println(declaredMethod.getName());
            if (uc != null) {
                System.out.println("Found UseCase: " + uc.id() + "  " + uc.desc());
                useCases.remove(Integer.valueOf(uc.id()));
            } else {
                System.out.println("There no UseCase");
            }
            System.out.println();
        }
        for (Integer useCase : useCases) {
            System.out.println("Warning: Missing UseCase - " + useCase);
        }
    }
}

