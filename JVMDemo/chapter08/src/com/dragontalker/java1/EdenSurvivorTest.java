package com.dragontalker.java1;

/**
 * -Xms600m -Xmx600m -XX:+PrintGCDetails
 *
 * -NewRatio: 设置新生代与老年代的比例, 默认是值是2, 即1:2
 * -XX:SurvivorRatio: 设置新生代中Eden区与Survivor区的比例
 * -XX:-UseAdaptiveSizePolicy: 关闭自适应的内存分配策略(暂时用不到)
 * -Xmn: 设置新生代的空间大小
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
