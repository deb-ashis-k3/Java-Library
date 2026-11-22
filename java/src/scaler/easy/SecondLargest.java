package scaler.easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 5, 6, 7 };
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        for (int value : arr) {
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (max > value && secondMax < value) {
                secondMax = value;
            }
        }
        return secondMax;
    }
}