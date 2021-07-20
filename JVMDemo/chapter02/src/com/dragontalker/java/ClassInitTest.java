package com.dragontalker.java;

public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
    }

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
    }
}
