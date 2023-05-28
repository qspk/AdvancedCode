package inner.test1;

/**
 * 匿名内部类的格式
 *
 * - 格式：new 类名 ( ) {  重写方法 } /   new  接口名 ( ) { 重写方法 }
 */
public class Test4 {
    public static void main(String[] args) {

        //等号右边: 是匿名内部类,定义并创建该接口的子类对象
        //等号左边,多态赋值,接口类型引用指向子类对象

        FlyAble flyAble = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("芜湖，起飞！！✈️✈️✈️");
            }
        };
        flyAble.fly();
    }
}

interface FlyAble {
    void fly();
}
