package scaler.easy;

import java.util.Arrays;

public class ArrayRotationN_TimesToWardsLeft {
    public static void main(String[] args) {
        ArrayRotationN_TimesToWardsLeft aRotationN_TimesToWardsLeft = new ArrayRotationN_TimesToWardsLeft();
        int[] arr = { 1, 2, 3, 4 };
        int query = 1;
        System.out.println(Arrays.toString(aRotationN_TimesToWardsLeft.solve(arr, query)));
    }

    public int[] solve(int[] arr, int query) {
        if (arr == null || arr.length <= 1)
            return arr;
        int arrSize = arr.length;
        query = query % arrSize;
        reverse(arr, 0, query - 1);
        reverse(arr, query, arrSize - 1);
        reverse(arr, 0, arrSize - 1);
        return arr;
    }

    public int[] reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
