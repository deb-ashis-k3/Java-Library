package topics.slidingWindow.easy;

public class SubarrayWithGivenSumAndLenght {
    public static void main(String[] args) {
        SubarrayWithGivenSumAndLenght subarrayWithGivenSumAndLenght = new SubarrayWithGivenSumAndLenght();
        int[] arr = { 4, 3, 2, 6, 1 };
        int B = 3, C = 11;

        System.out.println(subarrayWithGivenSumAndLenght.solve(arr, B, C));
        System.out.println(subarrayWithGivenSumAndLenght.optimizeSolve(arr, B, C));

    }

    public int solve(int[] arr, int B, int C) {
        int N = arr.length;
        int outerLoop = N - B;
        for (int i = 0; i <= outerLoop; i++) {
            int sum = 0;
            int innerLoop = i + B;
            for (int j = i; j < innerLoop; j++) {
                sum += arr[j];
            }
            if (sum == C)
                return 1;
        }
        return 0;
    }

    public int optimizeSolve(int[] arr, int B, int C) {
        int N = arr.length;
        long sum = 0;

        for (int i = 0; i < B; i++) {
            sum += arr[i];
        }
        if (sum == C)
            return 1;

        for (int i = B; i < N; i++) {
            sum = sum - (arr[i - B] + arr[i]);
            if (sum == C)
                return 1;
        }
        return 0;
    }
}
