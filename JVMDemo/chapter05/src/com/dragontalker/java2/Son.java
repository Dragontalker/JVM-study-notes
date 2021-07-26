package com.dragontalker.java2;

class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father " + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}

public class Son extends Father{

    public Son() {
        super();
    }

    public Son(int age) {
        this();
    }

    // 不是重写的父类方法, 因为静态方法不能被重写
    public static void showStatic(String str) {
        System.out.println("son " + str);
    }

    private void showPrivate(String str) {
        System.out.println("son private " + str);
    }

    public void show() {
        //invokestatic
        showStatic("atguigu.com");
        //invokestatic
        super.showStatic("good!");

        //invokespecial
        showPrivate("hello!");
        //invokespecial
        super.showCommon();


        showFinal();
        showCommon();
        info();

        MethodInterface in = null;
        in.methodA();
    }

    public void info() {}
}

interface MethodInterface {
    void methodA();
}
