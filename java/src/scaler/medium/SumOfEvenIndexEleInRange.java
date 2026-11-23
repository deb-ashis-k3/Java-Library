package scaler.medium;

import java.util.Arrays;

public class SumOfEvenIndexEleInRange {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[][] queries = { { 1, 3 }, { 1, 4 } };

        System.out.println(Arrays.toString(getEvenIndexElE(arr, queries)));
    }

    static int[] getEvenIndexElE(int[] arr, int[][] queries) {
        if (arr == null || queries == null)
            return new int[0];

        int[] prefixArr = new int[arr.length + 1];
        int[] response = new int[queries.length];
        prefixArr[0] = 0;
        for (int i = 1; i <= arr.length; i++) {
            int idx = i - 1;
            prefixArr[i] = ((idx) % 2 == 0) ? prefixArr[idx] + arr[idx] : prefixArr[idx];
        }
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            response[i] = prefixArr[right + 1] - prefixArr[left];
        }
        return response;
    }
}
