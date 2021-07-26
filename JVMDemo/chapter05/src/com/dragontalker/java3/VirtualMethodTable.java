package com.dragontalker.java3;

interface Friendly {
    void sayHello();
    void sayGoodbye();
}

class Dog {
    public void sayHello() {}

    public String toString() {
        return "Dog";
    }
}

class Cat implements Friendly {
    public void eat() {}

    public void sayHello() {}

    public void sayGoodbye() {}

    protected void finalize() {}
}

public class VirtualMethodTable {
}
