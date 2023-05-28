package system;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int sum = 1;
        long start = System.currentTimeMillis();
        System.out.println(start);
        for (int i = 1; i < 100000; i++) {
            sum *= i;
            System.out.println(sum);
        }

        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);
        System.out.println("------------------");


        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = new int[30];
        System.arraycopy(a, 0, b, 5, 5);
        String s = Arrays.toString(b);
        System.out.println(s);
    }
}
