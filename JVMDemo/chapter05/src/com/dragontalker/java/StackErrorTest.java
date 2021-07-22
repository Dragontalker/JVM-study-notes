package com.dragontalker.java;

/**
 * 演示栈中的异常
 *
 * 默认情况下: count: 11422
 * 设置栈大小: Xss256k : count: 2459
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
