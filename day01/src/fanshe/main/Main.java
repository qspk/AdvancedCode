package fanshe.main;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取Student类的main方法 不是当前类的main方法
 */

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.获取Student对象的字节码
        try {
            Class clazz = Class.forName("fanshe.main.Student");
            //2.获取main方法
            Method methodMain = clazz.getMethod("main",String[].class);
            //3.调用main方法
            //methodMain.invoke(null, new String[]{"a", "b", "c"});
                //第一个参数,对象类型,因为方法是static静态的,所以null可以
                //第二个参数是String数组, 注意 在jdk1.4时是数组,jdk1.5之后是可变参数
            //这里拆的时候将 new String[]{"a","b","c"}拆成3个对象...所以需要将他强转.
            Object obj = methodMain.invoke(null, (Object)new String[]{"a", "b", "c"});//方式一
//            methodMain.invoke(null,new Object[]{new String(){"a","b","c"}});//方式二
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
