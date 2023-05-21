package mytest;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {};

        System.out.println(a.length);
        System.out.println(b.length);

        String c = "";
        String d = "df";
        String[] e = new String[3];
        System.out.println(c.isEmpty());//true
        System.out.println(d.isEmpty());//false
//        System.out.println(e[2].isEmpty());//NullPointException

        System.out.println(c == null);//false
        System.out.println(d == null);//false
        System.out.println(e[2] == null);//true

        System.out.println("----------------------------");
        ArrayList<String> f = new ArrayList<>(20);  //初始化20长度
        ArrayList<String> g = new ArrayList<>();  //无初始化默认10 长度

//        System.out.println(g.get(0) == null);  //IndexOutOfBoundsException  : Index: 0, Size: 0
        System.out.println(f.isEmpty()); //true
        System.out.println(g.isEmpty()); //true
        System.out.println(f.size());   //0
        System.out.println(g.size());   //0



    }
}
