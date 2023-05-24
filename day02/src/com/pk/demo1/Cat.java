package com.pk.demo1;

public class Cat extends Animal {
    String color;

    public Cat() {
        System.out.println("子类无参构造已执行***********");
    }

    public Cat(String color) {
        this.color = color;
        System.out.println("子类有参构造已执行..color: " + color);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.println("子类有参构造已执行..name: " + name + "..age: " + age + "..color" + color);
    }
}




