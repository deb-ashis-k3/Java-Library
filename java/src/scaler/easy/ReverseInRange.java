package scaler.easy;

import java.util.Arrays;

public class ReverseInRange {
    // Reverse the first three values of the sample array and print the result.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(reverse(arr, 0, 2)));
    }

    // Reverse the values between start and end, including both positions.
    static int[] reverse(int[] arr, int start, int end) {
        // Swap the outside pair, then move inward until the range is reversed.
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
