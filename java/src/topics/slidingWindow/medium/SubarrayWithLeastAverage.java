package topics.slidingWindow.medium;

public class SubarrayWithLeastAverage {
    public static void main(String[] args) {
        SubarrayWithLeastAverage subarrayWithLeastAverage = new SubarrayWithLeastAverage();
        int[] arr = { 3, 7, 90, 20, 10, 50, 40 };
        int B = 3;
        System.out.println(subarrayWithLeastAverage.solve(arr, B));
        System.out.println(subarrayWithLeastAverage.solveOp(arr, B));

    }

    public int solve(int[] arr, int B) {
        int N = arr.length;
        long minSum = Long.MAX_VALUE;
        int minIdx = 0;

        for (int i = 0; i <= N - B; i++) {
            long sum = 0;
            for (int j = i; j < i + B; j++) {
                sum += arr[j];
            }
            if (sum < minSum) {
                minSum = sum;
                minIdx = i;
            }
        }
        return minIdx;
    }

    public int solveOp(int[] arr, int B) {
        int N = arr.length;
        long sum = 0;

        for (int i = 0; i < B; i++) {
            sum += arr[i];
        }
        long minSum = sum;
        int minIdx = 0;
        for (int i = B; i < N; i++) {
            sum = sum - arr[i - B] + arr[i];
            if (minSum > sum) {
                minSum = sum;
                minIdx = i - B + 1;
            }
        }
        return minIdx;
    }
}
