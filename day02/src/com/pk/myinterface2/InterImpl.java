package com.pk.myinterface2;

public class InterImpl implements Inter,InterB {  //实现多个接口中的同名静态方法不会冲突,不强制重写

    @Override
    public void show() {

    }

    public void method() {
        System.out.println(num);
    }
}
