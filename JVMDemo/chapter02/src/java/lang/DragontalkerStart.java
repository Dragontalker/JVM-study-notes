package java.lang;

public class DragontalkerStart {

    public static void main(String[] args) {

        // java.lang.SecurityException: Prohibited package name: java.lang
        // 引导类加载拒绝加载未知的外来类: 没有权限
        System.out.println("Hello dragontalker!");
    }
}
