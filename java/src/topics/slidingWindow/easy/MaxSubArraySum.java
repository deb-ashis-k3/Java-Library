package topics.slidingWindow.easy;

import java.util.TreeSet;

public class MaxSubArraySum {
    public static void main(String[] args) {
        MaxSubArraySum maxSubArraySum = new MaxSubArraySum();
        int[] arr = { 2, 1, 3, 4 };
        int B = 5;
        int A = arr.length;
        System.err.println(maxSubArraySum.maxSubarrayBruteForce(A, B, arr));
        System.err.println(maxSubArraySum.maxSubarrayOptimized(A, B, arr));
        System.err.println(maxSubArraySum.maxSubArrayIncludeNegative(A, B, arr));

    }

    public int maxSubarrayBruteForce(int A, int B, int[] C) {
        if (C == null || C.length <= 0 || B == 0)
            return 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < A; i++) {
            int subArraySum = 0;
            for (int j = i; j < A; j++) {
                subArraySum += C[j];
            }
            if (subArraySum <= B) {
                maxSum = Math.max(maxSum, subArraySum);
            }
        }
        return maxSum == Integer.MIN_VALUE ? 0 : maxSum;

    }

    public int maxSubarrayOptimized(int A, int B, int[] C) {
        if (C == null || C.length <= 0 || B == 0)
            return 0;
        int left = 0;
        long sum = 0;
        long maxSum = Long.MIN_VALUE;
        for (int right = 0; right < A; right++) {
            sum += C[right];
            while (sum > B && left <= right) {
                sum -= C[left];
                left++;
            }
            if (sum <= B) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum == Long.MIN_VALUE ? 0 : (int) maxSum;
    }

    public int maxSubArrayIncludeNegative(int A, int B, int[] C) {
        if (C == null || C.length == 0 || A <= 0)
            return 0;

        int N = C.length;
        long maxSum = Long.MIN_VALUE;
        long prefixSum = 0;
        TreeSet<Long> tSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            prefixSum += C[i];
            long target = prefixSum - B;
            Long previous = tSet.ceiling(target);
            if (previous != null) {
                long currentSum = prefixSum - previous;
                maxSum = Math.max(maxSum, currentSum);
            }
            tSet.add(previous);
        }
        if (maxSum == Long.MIN_VALUE) {
            return 0;
        }
        return Math.toIntExact(maxSum);
    }
    
}
