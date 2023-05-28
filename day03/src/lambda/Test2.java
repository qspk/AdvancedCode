package lambda;

//接口
interface Eatable {
    void eat();
}
//实现类
class EatableImpl implements Eatable {
    @Override
    public void eat() {
        System.out.println("一天一苹果，医生远离我");
    }
}
//测试类
public class Test2 {
    public static void main(String[] args) {
        //在主方法中调用useEatable方法
        Eatable e = new EatableImpl();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });

        //Lambda表达式
        useEatable(() ->
            System.out.println("一天一苹果，医生远离我")
        );
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}