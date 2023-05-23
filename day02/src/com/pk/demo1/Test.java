package com.pk.demo1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "小黑";
        d.age = 2;
        System.out.println(d.name);
        System.out.println(d.age + "岁");
        d.show();

    }
}
