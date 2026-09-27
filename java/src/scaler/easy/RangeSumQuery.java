package scaler.easy;

import java.util.*;

public class RangeSumQuery {

    public static void main(String[] args) {
        RangeSumQuery rangeSumQuery = new RangeSumQuery();
        int[] arr = { 1, 2, 3, 4, 5 };
        int[][] query = { { 0, 2 }, { 1, 4 } };
        System.out.println(Arrays.toString(rangeSumQuery.solve(arr, query)));

    }

    public long[] solve(int[] arr, int query[][]) {
        if (arr == null || query == null)
            return new long[0];

        int arrSize = arr.length;
        int querySize = query.length;

        long[] prerixArr = new long[arrSize + 1];
        long[] responseArr = new long[querySize];

        for (int i = 0; i < arrSize; i++) {
            prerixArr[i + 1] = prerixArr[i] + arr[i];
        }

        for (int i = 0; i < querySize; i++) {
            int left = query[i][0];
            int right = query[i][1];
            responseArr[i] = prerixArr[right + 1] - prerixArr[left];
        }
        return responseArr;
    }

}
