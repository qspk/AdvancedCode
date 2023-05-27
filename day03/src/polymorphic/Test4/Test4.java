package polymorphic.Test4;


abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome() {
        System.out.println("看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

public class Test4 {
    public static void main(String[] args) {
        userAnimal(new Dog());
        userAnimal(new Cat());

    }

    private static void userAnimal(Animal animal) {
        animal.eat();

        //判断animal变量记录的类型,是否是Dog   直接强转类型不匹配的话会出现 ClassCastException
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.watchHome();
        }
    }
}
