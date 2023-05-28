package lambda;

interface Flyable {
    void fly(String s);
}

public class Test1 {
    public static void main(String[] args) {
        useFlyable(s-> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });

        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println("匿名内部类");
                System.out.println(s);
            }
        });
    }

    public static void useFlyable(Flyable flyable) {
        flyable.fly("起飞 起飞");
    }
}
