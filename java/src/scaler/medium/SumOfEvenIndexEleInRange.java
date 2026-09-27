package scaler.medium;

import java.util.Arrays;

public class SumOfEvenIndexEleInRange {
    public static void main(String[] args) {

        int[] arr = { 2, 8, 3, 9, 15 };
        int[][] queries = { { 1, 4 }, { 0, 2 }, { 2, 3 } };
        SumOfEvenIndexEleInRange sumOfEvenIndexEleInRange = new SumOfEvenIndexEleInRange();
        System.out.println(Arrays.toString(sumOfEvenIndexEleInRange.sumOfEvenIndexedElements(arr, queries)));
    }

    public int[] sumOfEvenIndexedElements(int[] arr, int[][] queries) {

        if (arr == null)
            return new int[0];

        int arrSize = arr.length;
        int[] prefixArr = new int[arrSize + 1];
        for (int i = 0; i < arrSize; i++) {
            prefixArr[i + 1] = ((i % 2) == 0) ? prefixArr[i] + arr[i] : prefixArr[i];
        }
        int querySize = queries.length;
        int[] response = new int[querySize];
        for (int i = 0; i < querySize; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            response[i] = prefixArr[right + 1] - prefixArr[left];
        }
        return response;
    }
}
