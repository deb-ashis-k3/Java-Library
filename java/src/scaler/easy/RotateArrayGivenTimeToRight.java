package scaler.easy;

import java.util.Arrays;

public class RotateArrayGivenTimeToRight {
    // Move the last two values of the sample array to the front and print it.
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(solve(arr, 2)));
    }

    // Move the last queries values to the front while keeping their order.
    static int[] solve(int[] arr, int queries) {

        // If there are no values, there is nothing to rotate.
        if (arr.length == 0 || arr == null)
            return new int[] {};

        int size = arr.length;
        // Extra full rotations do not change the array, so keep only the remainder.
        queries = queries % size;

        // Reverse the whole array, then the new first and second sections.
        // These three reversals put the last queries values at the front.
        rotate(arr, 0, size - 1);
        rotate(arr, 0, queries - 1);
        rotate(arr, queries, size - 1);

        return arr;
    }

    // Reverse the values from start through end by swapping inward.
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
