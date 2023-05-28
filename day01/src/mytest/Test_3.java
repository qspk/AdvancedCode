package mytest;

/**
 *  String equals
 */
public class Test_3 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = new String(s1);
        String s3 = new String("abcd");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
    }
}
