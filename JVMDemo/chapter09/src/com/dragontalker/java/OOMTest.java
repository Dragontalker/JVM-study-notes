package com.dragontalker.java;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

public class OOMTest {
    public static void main(String[] args) {
        int j = 0;
        try {
            OOMTest test = new OOMTest();
            for (int i = 0; i < 10000; i++) {
                // 创建ClassWriter对象, 用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                // 1. 指明版本号, 1.8
                // 2. 指明修饰符, public
                // 3. 指明类名, Class + i
                // 4. 指明包名, null
                // 5. 指明父类, java.lang.Object
                // 6. 指明接口, null
                 classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "CLass" + i, null, "java/lang/object", null);
                // 返回byte[]
                byte[] code = classWriter.toByteArray();
                // 类的加载
                // test.defineClass("Class" + i, code, 0, code.length); // Class对象
                j++;
            }
        } finally {
            System.out.println(j);
        }
    }
}
