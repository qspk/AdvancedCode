package inner.test1;

/**
 * 私有成员内部类
 *
 * - 将一个类，设计为内部类的目的，大多数都是不想让外界去访问，
 * 所以内部类的定义应该私有化，私有化之后，再提供一个可以让外界调用的方法，
 * 方法内部创建内部类对象并调用。
 */

public class Test2 {
    public static void main(String[] args) {
        // 无法直接定义内部类对象  Outer.Inner oi = new Outer().new Inner();
        Outer o = new Outer();
        o.show();
    }
}

class Outer {
    private int num = 10;
    private class Inner{
        public void show() {
            System.out.println(num);
        }
    }

    public void show() {
        Inner i = new Inner();
        i.show();
    }
}
