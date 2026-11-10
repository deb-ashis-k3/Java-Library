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
        // Compare values in nested loops and return as soon as a matching sum is found.
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

        // Sorting enables a two-pointer search, but changes the input array's order.
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                // The current values form a pair with the requested sum.
                return 1;
            } else if (sum < target) {
                // Increase the sum by moving past the smaller value.
                left++;
            } else {
                // Decrease the sum by moving past the larger value.
                right--;
            }
        }
        return 0;
    }

    static int approach3(int[] arr, int target) {

        HashSet<Integer> hSet = new HashSet<>();
        for (int value : arr) {
            // A previously seen complement would pair with this value to make target.
            int complement = target - value;
            if (hSet.contains(complement)) {
                return 1;
            }
            // Save this value so later elements can use it as their complement.
            hSet.add(value);
        }
        return  0;
    }
}
