package polymorphic;


class Animal {
    public void eat(){
        System.out.println("动物吃一般的粮食");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }
}
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }
}

/**
 *      多态的前提
 *          1.要有(继承 \ 实现)关系
 *          2.要有方法重写
 *          3.要有父类引用,指向子类对象
 */
public class Test1 {
    public static void main(String[] args) {
        //当前事物,是只猫
        Cat c = new Cat();
        //是动物
        Animal a1 = new Cat();
        a1.eat();

        Dog d = new Dog();

        Animal a2 = new Dog();
        a2.eat();

    }

}
