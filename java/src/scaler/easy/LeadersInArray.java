package scaler.easy;

import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        LeadersInArray leadersInArray = new LeadersInArray();
        System.out.println(Arrays.toString(leadersInArray.solve(arr)));
    }

    public int[] solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int n = arr.length;
        int[] leaders = new int[n];

        int count = 0;
        int maxRight = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxRight) {
                leaders[count++] = arr[i];
                maxRight = arr[i];
            }
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = leaders[count - 1 - i];
        }

        return result;
    }
}
