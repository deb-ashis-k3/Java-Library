package scaler.easy;

public class SumOfMinAndMax {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        // An empty array has no minimum or maximum values.
        if (arr.length == 0 || arr == null)
            return 0;

        int sum = 0;
        // Start with the largest possible minimum and smallest possible maximum.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Track the smallest and largest values in a single pass.
        for (int value : arr) {
            max = Math.max(value, max);
            min = Math.min(value, min);
        }

        // Return the sum of the array's minimum and maximum values.
        sum = max + min;
        return sum;
    }
}
