package com.dragontalker.java1;

import java.io.FileNotFoundException;

public class CustomClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        throw new ClassNotFoundException();
    }

    private byte[] getClassFromCustomPath(String name) {
        // 从自定义路径中加载指定类: 细节省略

        return null;
    }
}
