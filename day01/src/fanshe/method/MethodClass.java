package fanshe.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * 获取成员方法并调用:
 *
 * 1.批量的:
 *  public Method[] getMethods(); 获取所有公有方法,包含父类及Object类
 *  public Method[] getDeclaredMethods(); 获取所有成员方法,不包括继承的
 *
 * 2.获取单个的:
 *   public Method getMethod(String name,Class<?>...parameterTypes);
 *      参数: name: 方法名   Class: 形参的Class类型对象
 *   public Method getMethod(String name,Class<?>...parameterTypes);
 *
 * 调用方法:
 *      Method --> public Object invoke(Object obj,Object...args)
 *          参数:  obj:要调用方法的对象;
 *                args:调用方法时所传递的实参;
 */
public class MethodClass {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获得Class对象
        Class stuClass = Class.forName("fanshe.method.Student");
        //2.获取所有公有方法
        System.out.println("******************获取所有公有方法*************");
        Method[] methods = stuClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("*******************获取所有方法****************");
        methods = stuClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("*****************获取共有的show1()方法**********");
        Method method = stuClass.getMethod("show1", String.class);
        System.out.println(method);
        //实例化一个Student对象
        Object obj = stuClass.getConstructor().newInstance();
        method.invoke(obj, "刘德华");


        System.out.println("*****************获取私有的show4()方法************");
        method = stuClass.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        //解除私有限定
        method.setAccessible(true);
        //需要两个参数,一个是要调用的对象(获取有反射)
        Object result = method.invoke(obj, 20);
        System.out.println("返回值: " + result);
    }


}
