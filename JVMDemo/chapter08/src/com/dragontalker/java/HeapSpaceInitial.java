package com.dragontalker.java;

/**
 * -Xms 用来设置堆空间(年轻代+老年代) 的初始内存大小
 *      - X 是JVM的运行参数
 *      - ms 是memory start
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {

        // 返回Java虚拟机中的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;

        // 返回Java虚拟机中视图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-Xms : " + initialMemory + "M");
        System.out.println("-Xmx : " + maxMemory + "M");

        System.out.println("系统初始内存大小为: " + initialMemory * 64.0 / 1024 + "G");
        System.out.println("系统最大内存大小为: " + maxMemory * 4.0 / 1024 + "G");
    }
}
