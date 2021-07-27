package com.dragontalker.java1;

/**
 * 测试-XX:UserTLAB参数是否开启的情况:
 *  - 默认是开启的, 占Eden大于1%的空间
 *
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
