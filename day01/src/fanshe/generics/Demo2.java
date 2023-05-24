package fanshe.generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * 通过反射越过泛型检查
 *
 * 例如: 有一个String泛型集合,怎样能向这个集合中添加一个Integer类型的值?
 */
public class Demo2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");

        //strList.add(100)
        //获取ArrayList的Class对象,反向的调用add()方法,添加数据
        Class listClass = strList.getClass(); //得到 strList 对象的字节码 对象
        //获取add()方法
        Method m = listClass.getMethod("add", Object.class);
        //调用add()方法
        m.invoke(strList, 100);

        //遍历集合
        for (Object obj : strList) {
            System.out.println(obj);
        }

   /*     for (String s : strList) {
            System.out.println(s);
            加入了int型数据,String接受时会报错
        }*/
    }
}
