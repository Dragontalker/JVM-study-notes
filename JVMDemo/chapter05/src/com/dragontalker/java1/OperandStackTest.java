package com.dragontalker.java1;

public class OperandStackTest {

    public void testAddOperation() {
        // byte, short, char, boolean: 都以int型来保存
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum() {
        // 获取上一个栈帧返回的结果, 并保存在操作数栈中
        int i = getSum();
        int j = 10;
    }

    /*
    程序员面试过程中, 常见的i++和++i的区别
     */
    public void add() {
        // 第一类问题:
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        // 第二类问题:
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;
    }
}
