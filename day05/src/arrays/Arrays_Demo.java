package arrays;

/**
 *  Arrays 的常用方法
 */

import java.util.Arrays;

public class Arrays_Demo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 1, 7};
        String s = Arrays.toString(arr);
        System.out.println(s);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 6);
        System.out.println(index);

         index = Arrays.binarySearch(arr, 0);
        System.out.println(index);

    }
}
