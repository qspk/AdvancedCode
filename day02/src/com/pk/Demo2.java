package com.pk;

public class Demo2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}

class Fu {
    int a = 10;

}

class Zi extends Fu {
    int a =20;

    public void method(){
        int a = 30;

        System.out.println(a);  //30
        System.out.println(this.a);  //20
        System.out.println(super.a); //10
    }

}
