package lambda;

/*
    游泳接口
 */
interface Swimming {
    void swim();
}

public class Test1 {
    public static void main(String[] args) {
        // 通过匿名内部类实现
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("铁汁, 我们去游泳吧");
            }
        });

        /*  通过Lambda表达式实现
            理解: 对于Lambda表达式, 对匿名内部类进行了优化
         */
        goSwimming(() -> System.out.println("不去咯"));
    }

    /**
     * 使用接口的方法
     */
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}