package scaler.medium;

import java.util.*;

public class SumOfOddIndexEleInGivenRange {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 4, 5 };
        int[][] queries = { { 1, 3 }, { 2, 5 }, { 0, 5 }, { 2, 2 } };

        SumOfOddIndexEleInGivenRange sumOfOddIndexEleInGivenRange = new SumOfOddIndexEleInGivenRange();
        System.out.println(Arrays.toString(sumOfOddIndexEleInGivenRange.solve(arr, queries)));

    }

    public int[] solve(int[] arr, int[][] queries) {
        if (arr == null || queries == null)
            return new int[0];

        int arrLen = arr.length;
        int[] prefixArr = new int[arrLen + 1];
        for (int i = 0; i < arrLen; i++) {
            prefixArr[i + 1] = (i % 2) != 0 ? prefixArr[i] + arr[i] : prefixArr[i];
        }

        int queryLen = queries.length;
        int[] response = new int[queryLen];
        for (int i = 0; i < queryLen; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            response[i] = prefixArr[right + 1] - prefixArr[left];
        }
        return response;
    }
}
