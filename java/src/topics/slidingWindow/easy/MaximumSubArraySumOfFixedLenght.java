package topics.slidingWindow.easy;


public class MaximumSubArraySumOfFixedLenght {
    public static void main(String[] args) {
        MaximumSubArraySumOfFixedLenght maximumSubArraySumOfFixedLenght = new MaximumSubArraySumOfFixedLenght();
        int[] arr = { 3, 9, 5, 6, 5, 11 };
        int B = 3;
        System.out.println(maximumSubArraySumOfFixedLenght.solve(arr, B));
        System.out.println(maximumSubArraySumOfFixedLenght.solveOP(arr, B));

    }

    public long solve(int[] arr, int B) {
        long sum = Long.MIN_VALUE;
        int N = arr.length;
        for (int i = 0; i <= N - B; i++) {
            int tempSum = 0;
            for (int j = i; j < i + B; j++) {
                tempSum += arr[j];
            }
            sum = Math.max(tempSum, sum);
        }
        return sum;
    }

    public long solveOP(int[] arr, int B) {
        long maxSum = Long.MIN_VALUE;
        int sum = 0;
        int N = arr.length;

        for (int i = 0; i < B; i++) {
            sum += arr[i];
        }

        for (int i = B; i < N; i++) {
            sum = sum - arr[i - B] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
