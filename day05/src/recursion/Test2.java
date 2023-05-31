package recursion;

/**
 *  递归求阶乘
 */
public class Test2 {
    public static void main(String[] args) {
        long a = 49L;
        System.out.println("阶乘为: " + factorial(a));
    }

    private static long factorial(long a) {
        if (a == 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }
}









