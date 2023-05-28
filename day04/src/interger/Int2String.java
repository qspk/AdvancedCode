package interger;

public class Int2String {
    public static void main(String[] args) {
        int num = 100;

        //方法一
        String s1 = num + "";
        System.out.println(s1);

        //方法二
        String s2 = String.valueOf(num);
        System.out.println(s2);

    }
}
