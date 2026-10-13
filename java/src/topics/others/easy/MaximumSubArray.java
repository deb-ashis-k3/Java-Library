package topics.others.easy;

public class MaximumSubArray {
    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] arr = { 2, 1, 3, 4, 5 };
        int A = 5;
        int B = 12;
        System.out.println(maximumSubArray.maxSubarray(A, B, arr));
        System.out.println(maximumSubArray.maxSubarra2(A, B, arr));

    }

    public int maxSubarray(int firstArg, int targetSum, int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int maxSum = 0;
        for (int i = 0; i < firstArg; i++) {
            for (int j = i; j < firstArg; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxSum = sum <= targetSum ? Math.max(maxSum, sum) : maxSum;
            }
        }
        return maxSum;
    }
    public int maxSubarra2(int firstArg, int targetSum, int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int maxSum = 0;
        for (int i = 0; i < firstArg; i++) {
            int sum = 0;
            for (int j = i; j < firstArg; j++) {
                sum+=arr[j];
                maxSum = sum <= targetSum ? Math.max(maxSum, sum) : maxSum;
            }
        }
        return maxSum;
    }

}
