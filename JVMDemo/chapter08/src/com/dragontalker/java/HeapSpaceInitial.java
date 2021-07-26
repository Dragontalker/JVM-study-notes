package com.dragontalker.java;

/**
 * -Xms 用来设置堆空间() 的初始内存大小
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {

        // 返回Java虚拟机中的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;

        // 返回Java虚拟机中视图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
    }
}
