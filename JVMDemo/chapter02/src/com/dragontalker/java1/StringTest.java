package com.dragontalker.java1;

public class StringTest {

    public static void main(String[] args) {
        // 执行的还是java本身的String而不是我们自定义的java.lang.String
        // 这里体现的是双亲委派机制
        String str = new java.lang.String();
        System.out.println("Hello, world!");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader()); // sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
