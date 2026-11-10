package scaler.easy;

import java.util.Arrays;

public class RotateArrayGivenTimeToLeft {

    // Move the first three values to the end and print the rotated array.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(solve(arr, 3)));
    }

    // Move the first queries values to the end while keeping their order.
    static int[] solve(int[] arr, int queries) {

        if (arr == null || arr.length == 0) {
            return arr;
        }

        int size = arr.length;

        // Normalize the number of rotations.
        queries = queries % size;

        // Step 1: Reverse the second portion.
        reverse(arr, queries, size - 1);

        // Step 2: Reverse the first portion.
        reverse(arr, 0, queries - 1);

        // Step 3: Reverse the entire array.
        reverse(arr, 0, size - 1);

        return arr;
    }

    // Reverse just the part of the array between start and end.
    static void reverse(int[] arr, int start, int end) {
        // Swap the two ends of the selected part and work toward its middle.
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
