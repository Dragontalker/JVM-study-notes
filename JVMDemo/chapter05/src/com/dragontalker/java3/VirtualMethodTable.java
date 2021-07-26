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

public class VirtualMethodTable {
}
