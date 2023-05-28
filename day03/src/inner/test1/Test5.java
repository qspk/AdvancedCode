package inner.test1;

public class Test5 {
    public static void main(String[] args) {

        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("一起去游泳吧~");
            }
        });

        goSwimming(()-> System.out.println("不去咯"));
    }

    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}

interface Swimming {
    void swim();
}
