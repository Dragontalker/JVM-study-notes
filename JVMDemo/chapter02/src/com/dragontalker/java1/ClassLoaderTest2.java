package com.dragontalker.java1;

public class ClassLoaderTest2 {

    public static void main(String[] args) {

        try {
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader); // null
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
