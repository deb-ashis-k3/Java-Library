package scaler.easy;

public class SecondLargest {
    // Try the method with a sample array and print the value it returns.
    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 5, 6, 7 };
        System.out.println(solve(arr));
    }

    // Track the largest value and the next-largest distinct value seen so far.
    static int solve(int[] arr) {
        // Start with the smallest possible int so the first array value can become the maximum.
        int max = Integer.MIN_VALUE;
        // This is the starting value used for the second-largest result.
        int secondMax = 0;

        for (int value : arr) {
            if (value > max) {
                // A new largest value was found; the old largest becomes second-largest.
                secondMax = max;
                max = value;
            } else if (max > value && secondMax < value) {
                // This value is below the maximum but bigger than the previous second-largest.
                secondMax = value;
            }
        }
        // Return the second-largest distinct value found in the array.
        return secondMax;
    }
}