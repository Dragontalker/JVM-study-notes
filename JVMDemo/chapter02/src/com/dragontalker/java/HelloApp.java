package com.dragontalker.java;

public class HelloApp {

    // 在prepare环节, a只会被赋值为0
    // 在initial环节, a才会被初始化为1
    private static int a = 1;

    // 如果是final修饰的常量, 则在prepare环节就会被赋值
    private final static int b = 2;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
