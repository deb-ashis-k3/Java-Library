package scaler.easy;

import java.util.Arrays;

public class RotateArrayGivenTimeToRight {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(solve(arr, 2)));
    }

    static int[] solve(int[] arr, int queries) {
        if (arr.length == 0 || arr == null)
            return new int[] {};
        int size = arr.length;
        queries = queries % size;
        rotate(arr, 0, size - 1);
        rotate(arr, 0, queries - 1);
        rotate(arr, queries, size - 1);

        return arr;
    }

    static int[] rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
