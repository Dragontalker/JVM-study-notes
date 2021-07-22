package com.dragontalker.java1;

import java.net.URL;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("***********启动类加载器***********");
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL element : urls) {
            System.out.println(element.toExternalForm());
        }
    }
}
