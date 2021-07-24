package com.dragontalker.java1;

import java.util.Date;

public class LocalVariablesTest {
    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public void test1() {
        Date date = new Date();
        String name1 = " dragontalker.com";
        String info = test2(date, name1);
        System.out.println(date + name1);
    }

    public String test2(Date dateP, String name2) {
        dateP = null;
        name2 = "richardyang";
        double weight = 200.05;
        char gender = '男';
        return dateP + name2;
    }

    public void test3() {
        count++;
    }

    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        // 变量c使用之前已经销毁的变量b占据的slot位置
        int c = a + 1;
    }

    /**
     * 变量的分类: 按照数据类型分:
     *  1. 基本数据类型
     *  2. 引用数据类型
     *
     *  按照在类中声明的位置分:
     *      1. 成员变量: 在使用前, 都经历过默认初始化赋值
     *          - 类变量: linking的prepare阶段: 给类变量默认赋值
     *                   initialization阶段: 给类变量显示赋值及给静态代码块赋值
     *          - 实例变量: 随着对象的创建, 会在堆空间中分配实例变量空间, 并进行默认赋值
     *      2. 局部变量
     */
}
