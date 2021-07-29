package com.dragontalker.java;

/**
 * 设置堆空间的大小: -Xms600m -Xmx600m
 *
 * 设置方法区大小参数的默认值
 *
 * JDK8及以后:
 * -XX:MetaspaceSize=100m
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
