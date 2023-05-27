package polymorphic;

public class Test2 {
    /**
     *  多态成员的访问特点
     *      成员变量: 编译看左边, 运行看左边
     *      成员方法: 编译看左边, 运行看右边
     */
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);
        f.method();

        System.out.println(f.num);
    }
}
class Fu {
    int num = 10;

    public void method(){
        System.out.println("Fu.. method");
    }
}

class Zi extends Fu {
    int num = 20;

    public void method(){
        super.num = 30;
        System.out.println("Zi.. method");
    }
}


