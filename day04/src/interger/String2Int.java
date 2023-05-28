package interger;

public class String2Int {
    public static void main(String[] args) {
        String s = "100";

        //方法一
        Integer i = Integer.valueOf(s);
        int x = i.intValue();   // 等于 int x = i;
        System.out.println(x);

        //方法二
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
