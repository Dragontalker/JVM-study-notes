package com.dragontalker.java2;

public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            alloc();
        }

        // 查看执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为: " + (end - start) + "ms");

        // 为了方便查看堆内存中对象个数, 线程sleep
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}