package com.dragontalker.java1;

public class ClassLoaderTest2 {

    public static void main(String[] args) {

        try {
            // 1. 获取当前类的ClassLoader
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader); // null

            // 2. 获取当前线程上下文的ClassLoader
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2

            // 3. 获取系统的ClassLoader
            ClassLoader classLoader1 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader1); // sun.misc.Launcher$ExtClassLoader@1540e19d
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
