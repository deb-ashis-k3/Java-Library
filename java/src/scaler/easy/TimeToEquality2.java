package scaler.easy;

import java.util.Arrays;

public class TimeToEquality2 {
    // Show the number of changes needed to make the sample values equal.
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 2 };
        System.out.println(solve(arr));
    }

    // Find the fewest unit changes needed when values may go up or down.
    static int solve(int[] arr) {
        // An empty array has no elements to make equal.
        if(arr==null|| arr.length==0)return 0;

        // The median minimizes the total absolute difference from all values.
        Arrays.sort(arr);
        int median = arr[arr.length / 2];
        int operations = 0;

        // Count the unit changes needed to bring each value to the median.
        for (int value : arr)
            operations += Math.abs(value - median);

        return operations;
    }
}
