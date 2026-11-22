package scaler.easy;

public class SumOfMinAndMax {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        if (arr.length == 0 || arr == null)
            return 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            max = Math.max(value, max);
            min = Math.min(value, min);
        }
        sum = max + min;
        return sum;
    }
}
