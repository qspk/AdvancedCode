package com.pk.test_abstract;

public abstract  class Animal {
    public void drink() {
        System.out.println("喝水");
    }

    public abstract void eat();  //抽象方法没有大括号,直接分号结尾
}
