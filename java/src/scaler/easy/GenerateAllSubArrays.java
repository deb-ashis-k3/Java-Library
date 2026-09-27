package scaler.easy;

import java.util.*;

public class GenerateAllSubArrays {
    public static void main(String[] args) {
        GenerateAllSubArrays generateAllSubArrays = new GenerateAllSubArrays();
        int[] arr = { 1, 2, 3 };
        System.out.println(Arrays.deepToString(generateAllSubArrays.solve(arr)));
        System.out.println(Arrays.deepToString(generateAllSubArrays.solution(arr)));

    }

    public long[][] solve(int[] arr) {
        if (arr == null)
            return new long[0][0];

        int arrLen = arr.length;
        int responseSize = arrLen * (arrLen + 1) / 2;
        long[][] response = new long[responseSize][];
        int responseIdx = 0;
        for (int i = 0; i < arrLen; i++) {
            for (int j = i; j < arrLen; j++) {
                int size = j - i + 1;
                long[] tempArr = new long[size];
                int tempIdx = 0;
                for (int k = i; k <= j; k++) {
                    tempArr[tempIdx] = arr[k];
                    tempIdx++;
                }
                response[responseIdx] = tempArr;
                responseIdx++;
            }
        }
        return response;
    }

    public int[][] solution(int[] arr) {
        if (arr == null)
            return new int[0][0];

        int arrSize = arr.length;

        int[][] responseArr = new int[arrSize * (arrSize + 1) / 2][];
        int responIdx = 0;

        for (int i = 0; i < arrSize; i++) {
            for (int j = i; j < arrSize; j++) {
                int length = j - i + 1;
                responseArr[responIdx] = new int[length];
                System.arraycopy(arr, i, responseArr[responIdx], 0, length);
                responIdx++;
            }

        }
        return responseArr;
    }
}
