package binarysearch;

/**
 *  二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int index = binarySearch(arr, key);
        System.out.println(key + " 所在数组索引为:\n" + index);

    }

    private static int binarySearch(Integer[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) >> 1;
            if (arr[mid] < key) {
                min = ++mid;
            } else if (arr[mid] > key) {
                max = --mid;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
