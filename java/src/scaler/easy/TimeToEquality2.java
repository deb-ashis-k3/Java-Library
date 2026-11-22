package scaler.easy;

import java.util.Arrays;

public class TimeToEquality2 {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 2 };
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        Arrays.sort(arr);
        int median = arr[arr.length / 2];
        int operations = 0;
        for (int value : arr)
            operations += Math.abs(value - median);
        return operations;
    }
}
