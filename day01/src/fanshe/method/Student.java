package fanshe.method;

public class Student {

    public void show1(String s) {
        System.out.println("调用了: 公有的的,无返回值,String参数的show1(): s = " + s);

    }

    protected void show2(){
        System.out.println("调用了: 受保护的,无参show2()");
    }

    void show3(){
        System.out.println("调用了: 默认的,无参的show3()");
    }

    private String show4(int age) {
        System.out.println("调用了,私有的,并有返回值的,int参数show4(): age = " + age);
        return "abcd";
    }

}
