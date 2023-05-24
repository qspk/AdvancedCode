package com.pk.demo1;

public class Animal {
    String name;
    int age;
    
    public void show() {
        System.out.println("................");
    }

    public Animal() {
        System.out.println("父类无参构造方法已执行");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类有参构造方法已执行");
    }
    
    
    

}
