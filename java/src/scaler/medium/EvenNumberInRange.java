package scaler.medium;

import java.util.*;

public class EvenNumberInRange {
    public static void main(String[] args) {
        EvenNumberInRange evenNumberInRange = new EvenNumberInRange();
        int[] arr = { 2, 1, 8, 3, 9, 6 };
        int[][] queries = { { 0, 3 }, { 3, 5 }, { 1, 3 }, { 2, 4 } };

        System.out.println(Arrays.toString(evenNumberInRange.solve(arr, queries)));

    }

    public int[] solve(int[] arr, int[][] queries) {
        if (arr == null || queries == null)
            return new int[0];

        int arrLen = arr.length;
        int[] prefixArr = new int[arrLen + 1];

        for (int i = 0; i < arrLen; i++) {
            prefixArr[i + 1] = prefixArr[i] + (arr[i] % 2 == 0 ? 1 : 0);
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
