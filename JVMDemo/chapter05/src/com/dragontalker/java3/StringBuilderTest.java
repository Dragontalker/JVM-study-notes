package com.dragontalker.java3;

/**
 * 面试题:
 * 方法中定义的局部变量是否线程安全? 具体情况具体分析
 */
public class StringBuilderTest {
    public static void method1() {
        // StringBuilder: 线程不安全
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        // ..
    }
}
