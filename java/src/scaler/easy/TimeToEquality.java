package scaler.easy;

public class TimeToEquality {
    // Show how many increases are needed to make all sample values equal.
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 2 };
        System.out.println(solution(arr));
    }

    // Find the number of increases needed when values can only be raised.
    static int solution(int[] arr) {
        // An empty array has no elements to make equal.
        if (arr == null || arr.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        int sec = 0;

        // Find the largest value and sum all values in one pass.
        for (int value : arr) {
            max = Math.max(value, max);
            sec += value;
        }

        // Each element must be increased to max; total increments equal
        // the sum of the target values minus the current sum.
        return (arr.length * max) - sec;

    }
}
