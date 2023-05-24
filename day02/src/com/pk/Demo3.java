package com.pk;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Father.a);

        Son.show();
        Son.show2();

        Son son = new Son();
        son.show3();
        son.show4();

    }
}

class Father {
    static int a = 10;

    public static void show() {
        System.out.println("父类静态方法");
    }

    public static void show2() {
        System.out.println("父类静态方法2");
    }


    public void show3() {
        System.out.println("父类非静态方法");
    }

    private void show9() {
        System.out.println("父类私有方法");
    }
}

class Son extends Father {
//    a =20;
//    super.a = 20;


    public static void show() {
        System.out.println("子类非静态方法");
    }

    @Override
    public void show3() {
        System.out.println("子类重写父类的非静态方法");
    }

    public void show4() {
        System.out.println("子类调用父类show3()方法");
    }


}