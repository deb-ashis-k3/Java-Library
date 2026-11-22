package scaler.easy;

import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[][] queries = { { 1, 3 }, { 4, 6 } };
        System.out.println(Arrays.toString(rangeSum(arr, queries)));

    }

    public static long[] rangeSum(int[] A, int[][] B) {
        if (A == null || B == null)
            return new long[] {};

        int aSize = A.length;
        long[] prefixArr = new long[aSize + 1];

        for (int i = 1; i < aSize; i++) {
            prefixArr[i] = prefixArr[i - 1] + A[i - 1];
        }

        int querySize = B.length;
        long[] result = new long[querySize];
        for (int i = 0; i < querySize; i++) {
            int left = B[i][0];
            int right = B[i][1];
            result[i] = prefixArr[right + 1] - prefixArr[left];
        }
        return result;

    }
}
