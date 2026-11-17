package scaler.easy;

import java.util.Arrays;

public class GenerateAllSubArrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.deepToString(getAllSubArrays(arr)));
    }

    public static int[][] getAllSubArrays(int[] arr) {
        if (arr == null || arr.length == 0)
            return new int[0][0];

        int arrLen = arr.length;
        int subArrayLen = (arrLen * (arrLen + 1)) / 2;
        int idx = 0;
        int[][] response = new int[subArrayLen][];
        for (int i = 0; i < arrLen; i++) {
            for (int j = i; j < arrLen; j++) {
                int len = j - i + 1;
                response[idx] = new int[len];
                System.arraycopy(arr, i, response[idx], 0, len);
                idx++;
            }
        }
        return response;

    }
}
