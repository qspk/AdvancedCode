package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过class对象可以获取某个类中的: 构造方法、成员变量、成员方法；并访问成员；
 * <p>
 * 1.获取构造方法
 * 1).批量的方法：
 * public Constructor[] getConstructors(): 所有"公有的"构造方法
 * public Constructor[] getDeclaredConstructors()
 * 获取所有的构造方法(包括私有、公有、受保护默认）
 * <p>
 * 2).获取单个的方法,并调用:
 * public constructor getConstructor(Class...parameterTypes):获取单个的"公有的"构造方法
 * public Constructor getDeclaredConstructor(Calss...parameterTypes):获取某个构造方法四权限都可以
 * <p>
 * 调用构造方法:
 * Constructor --> newInstance(Object...initargs)
 */
public class Constructors {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.加载Class对象
        Class clazz = null;
        try {
            clazz = Class.forName("fanshe.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //2.获取所有公有构造方法
        System.out.println("***************所有公有构造方法*****************");
        Constructor[] conArray = clazz.getConstructors();
        for (Constructor constructor : conArray) {
            System.out.println(constructor);
        }

        System.out.println("******************所有构造方法********************");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor constructor : conArray) {
            System.out.println(constructor);
        }

        System.out.println("***************获取公有、 无参的构造方法*****************");
        Constructor con = clazz.getConstructor(null);
        //1> 因为是无参的构造方法所以类型是一个null,不写也可以:这里需要的是一个参数类型,而不是变量名
        //2> 返回的是描述这个无参构造函数的对象

        System.out.println("con = " + con);
        //调用构造方法
        Object obj = con.newInstance();
        System.out.println("obj = " + obj);
        Student stu = (Student) obj;
        System.out.println(stu.getClass().getName());


        System.out.println("***************获取私有构造方法,并调用******************");
        con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);
        //调用构造方法
        con.setAccessible(true);  //暴力访问(忽略掉访问修饰符)
        obj = con.newInstance('王');

    }

}
