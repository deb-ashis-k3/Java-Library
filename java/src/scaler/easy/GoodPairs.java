package scaler.easy;

import java.util.*;

public class GoodPairs {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 7;
        System.out.println(approach1(arr, target));
        System.out.println(approach2(arr, target));
        System.out.println(approach3(arr, target));
    }

    static int approach1(int[] arr, int target) {
        int size = arr.length - 1;
        for (int i = 0; i < size; i++) {
            for (int j = i = 1; j < size; j++) {
                if (arr[i] + arr[j] == target)
                    return 1;
            }
        }
        return 0;
    }

    static int approach2(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return 1;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return 0;
    }

    static int approach3(int[] arr, int target) {
        HashSet<Integer> hSet = new HashSet<>();
        for (int value : arr) {
            int complement = target - value;
            if (hSet.contains(complement)) {
                return 1;
            }
            hSet.add(value);
        }
        return 0;
    }
}
