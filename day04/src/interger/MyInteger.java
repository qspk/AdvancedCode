package interger;

public class MyInteger {
    public static void main(String[] args) {
        Integer i3 = new Integer(100);
        Integer i4 = new Integer("100");


        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf("100");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}
