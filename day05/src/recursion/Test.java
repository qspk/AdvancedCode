package recursion;

/**
 * 递归求和
 */
public class Test {
    public static void main(String[] args) {
        int a = 1000;
        System.out.println("和为: " + add(a));
    }

    private static int add(int a) {
        if (a == 1) {
            return 1;
        }
        return a + add(a - 1);
    }
}
