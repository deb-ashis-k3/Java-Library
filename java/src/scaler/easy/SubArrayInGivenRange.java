package scaler.easy;

import java.util.*;

public class SubArrayInGivenRange {
    public static void main(String[] args) {
        int[] arr = { -2, 4, 1, 5, 2 };

        System.err.println(Arrays.toString(getSubArrayInRange(arr, 0, 2)));

    }

    static int[] getSubArrayInRange(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0)
            return new int[0];

        int[] rangeSubArray = new int[end - start + 1];
        int idx = 0;
        for (int i = start; i <= end; i++) {
            rangeSubArray[idx++] = arr[i];
        }
        return rangeSubArray;
    }
}
