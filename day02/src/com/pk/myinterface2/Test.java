package com.pk.myinterface2;

public class Test {
    public static void main(String[] args) {
        System.out.println(Inter.num);

        Inter.show2();  //接口内的静态方法只能通过  接口名.方法名  的方式调用
    }


}
