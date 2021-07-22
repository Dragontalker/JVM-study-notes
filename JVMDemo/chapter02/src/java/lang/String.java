package java.lang;

public class String {

    static {
        System.out.println("我是自定义的String类的静态代码块!");
    }

    // Error: Main method not found in class java.lang.String
    // 因为双亲委派机制, 会层层上传到引导类加载器, 而引导类加载器在原有java.lang.String中找不到main方法
    // 我们自定义的String类根本没有被加载
    public static void main(String[] args) {
        System.out.println("Hello, string!");
    }
}
