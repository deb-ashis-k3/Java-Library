package topics.slidingWindow.easy;

public class SubarrayWithGivenSumAndLenght {
    public static void main(String[] args) {
        SubarrayWithGivenSumAndLenght subarrayWithGivenSumAndLenght = new SubarrayWithGivenSumAndLenght();
        int[] arr = { 4, 3, 2, 6, 1 };
        int B = 3;
        int C = 11;
        System.out.println(subarrayWithGivenSumAndLenght.solve(arr, B, C));

    }

    public int solve(int[] arr, int B, int C) {
        int n = arr.length;

        for (int i = 0; i <= n - B; i++) {
            int sum = 0;
            for (int j = i; j < i + B; j++) {
                sum += arr[j];
            }
            if (sum == C) {
                return 1;
            }
        }
        return 0;
    }
}