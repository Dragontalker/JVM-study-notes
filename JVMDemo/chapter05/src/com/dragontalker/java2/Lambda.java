package com.dragontalker.java2;

/**
 * 体会invokedynamic指令
 */
interface Func {
    boolean func(String str);
}

public class Lambda {
    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s -> {
            return true;
        };
        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });
    }
}
