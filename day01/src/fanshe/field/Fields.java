package fanshe.field;

import java.lang.reflect.Field;

/**
 * 获取成员变量并调用:
 * <p>
 * 1.批量的
 * 1) Field[] getFields(); 获取所有公有字段
 * 2) Field[] getDeclaredFields(); 获取所有字段
 * 2.获取单个的
 * 1) public Field getField(String fieldName); 获取某个公有字段
 * 2) public Field getDeclaredField(String name); 获取某个字段
 * <p>
 * 设置字段的值
 * Field --> public void set(Object obj,Object value);
 * 参数说明:
 * 1.obj: 要设置字段所在的对象
 * 2.value: 要为字段设置的值
 */
public class Fields {

    public static void main(String[] args) throws Exception {
        //1.获取class对象
        Class psonClass = Class.forName("fanshe.field.Person");
        //2.获取字段
        System.out.println("***************获取所有公有字段**************");
        Field[] fieldArray = psonClass.getFields();
        for (Field field : fieldArray) {
            System.out.println(field);
        }

        System.out.println("*****************获取所有字段******************");
        fieldArray = psonClass.getDeclaredFields();
        for (Field field : fieldArray) {
            System.out.println(field);
        }

        System.out.println("*****************获取公有字段*并调用**************");
        Field f = psonClass.getField("name");
        System.out.println(f);
        //获取一个对象
        //产生Person对象 --> Person person = new Person();
        Object obj = psonClass.getConstructor().newInstance();

        //为字段赋值
        //为Student对象中的name属性赋值-->pson.name = "刘德华";
        f.set(obj,"刘德华");
        //验证
        Person person = (Person) obj;
        System.out.println(person);
        System.out.println("验证姓名: " + person.name);

        System.out.println("****************获取私有字段**并调用**************");
        f = psonClass.getDeclaredField("phoneNum");
        System.out.println(f);
        //暴力反射,解除私有限定
        f.setAccessible(true);
        f.set(obj, "18888889999");
        f = psonClass.getDeclaredField("age");
        f.set(obj,34);
        f = psonClass.getDeclaredField("sex");
        f.set(obj,'男');
        System.out.println("验证电话: " + person);

    }
}
