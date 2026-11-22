package scaler.easy;

import java.util.Arrays;

public class RotateArrayGivenTimeToLeft {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(solve(arr, 3)));
    }

    static int[] solve(int[] arr, int queries) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int size = arr.length;
        queries = queries % size;
        reverse(arr, queries, size - 1);
        reverse(arr, 0, queries - 1);
        reverse(arr, 0, size - 1);
        return arr;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
