package interger;

import java.util.Arrays;

/**
 * 有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：27 38 46 50 91
 */
public class Test {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        //将字符串分割为字符串数组
        String[] arr = s.split(" ");
        //字符串数组转换为 int型数组
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        //升序方法
        Arrays.sort(arrInt);

        String s1 = Arrays.toString(arrInt);
        System.out.println(s1);

        Arrays.sort(arr);
        String s2 = Arrays.toString(arr);
        System.out.println(s2);
    }
}
