package com.jaaaelu.gzw.learn.java.thinkingInJava.annotation;

public class UseCaseTest {

    @UseCase(id = 1, desc = "desc")
    private static void testUseCaseWithIdOne() {

    }

    @UseCase(id = 2)
    private static void testUseCaseWithIdTwo() {

    }

    private static void noUseCase() {

    }
}
