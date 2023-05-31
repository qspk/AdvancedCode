package objects;

import java.util.Objects;

/**
 *  测试Objects方法
 */
public class MyObjects {
    public static void main(String[] args) {
        String s = "qwe";
        String s1 = null;
        System.out.println(Objects.toString(s));
        System.out.println(Objects.toString(s1,"空字符串"));

        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.nonNull(s));

        Student s2 = new Student("钢丝管", 32);
        System.out.println(Objects.toString(s2));

    }
}















