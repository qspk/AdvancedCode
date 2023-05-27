package inner.test1;

/**
 *  静态成员内部类
 *
 * - 静态成员内部类访问格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
 * - 静态成员内部类中的静态方法：外部类名.内部类名.方法名();
 */
public class Test3 {
    public static void main(String[] args) {
        //外部类名.内部类名 对象名 = new 外部类名.内部类名()
        Outer0.Inner0 oi = new Outer0.Inner0();

        oi.show();
        //静态内部类的静态方法直接调用
        Outer0.Inner0.method();
    }
}

class Outer0 {
    static class Inner0 {
        public void show() {
            System.out.println("Inner...show");
        }

        public static void method() {
            System.out.println("Inner..static..method");
        }
    }

}
