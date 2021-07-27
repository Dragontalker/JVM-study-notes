package com.dragontalker.java1;

/**
 * 测试: 大对象直接进入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:PrintGCDetails
 *
 * Eden: 16m, S0: 2m, S1: 2m, Old: 40m
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        // 20m, 大于Eden的16m, 直接进入老年代
        byte[] buffer = new byte[1024 * 1024 * 20];
    }
}
