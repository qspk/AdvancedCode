package fanshe;


/*
    获取class对象的三种方式
    1.Object -->getClass()
    2.任何数据类型(包括基本数据类型),都有一个静态的class属性
    3.通过Class类的静态方法: forName(String ClassName) (常用)
        字符串为真实路径,包名.类名

    注意: 在运行期间,一个类,只有一个Class对象产生

    总结:第一种已经有对象了,不需要反射.第二种需要导入类的包,依赖太强,不导包
    就抛编译错误.一般都使用第三种,一个字符串可以传入也可写在配置文件中等多种方法
 */
public class Fanshe_Constructor {
    public static void main(String[] args) {
        //第一种
        //new 产生一个Student对象 ,一个Class对象
        Student student1 = new Student();
        Class stuClass = student1.getClass(); //获取Class对象
        System.out.println(stuClass.getName());

        //第二种
        Class stuCalss2 = Student.class;
        //判断第一种方式和第二种方式获得的Class对象是否是同一个
        System.out.println(stuClass == stuCalss2);

        //第三种
        try {
            Class stuClass3 = Class.forName("fanshe.Student");
            //判断三种方式获取的Class对象是不是一样的
            System.out.println(stuClass3 == stuCalss2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
