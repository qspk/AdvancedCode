package com.pk.myinterface;

public class PersonImpl implements Person{
    @Override
    public void study() {
        System.out.println("学习Java");
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
