package com.dragontalker.java;

import java.io.Serializable;

public class MethodInnerStrucTest  extends Object implements Comparable<String>, Serializable {
    // 属性
    public int num = 10;
    private static String str = "测试方法的内部结构";
    // 构造器
    // 方法
    public void test1() {
        int count = 20;
        System.out.println("count = " + count);
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
