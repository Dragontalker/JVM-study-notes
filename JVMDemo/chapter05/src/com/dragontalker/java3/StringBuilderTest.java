package com.dragontalker.java3;

/**
 * 面试题:
 * 方法中定义的局部变量是否线程安全? 具体情况具体分析
 *
 * 何为线程安全?
 *  - 如果只有一个线程才可以操作此数据, 则必是线程安全的
 *  - 如果有多个线程操作此数据, 则此数据是共享数据, 如果不考虑同步机制的话, 会存在线程安全问题
 */
public class StringBuilderTest {

    // s1的声明方式是线程安全的
    public static void method1() {
        // StringBuilder: 线程不安全
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        //...
    }

    public static void method2(StringBuilder sBuilder) {
        sBuilder.append("a");
        sBuilder.append("b");
        //...
    }
}
