package scaler.easy;

public class CountOfElementsGreaterThanItself {
    // Try the method with a sample array and print how many values qualify.
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3 };
        System.out.println(solve(arr));
    }

    // Count values that are smaller than at least one other value in the array.
    static int solve(int[] arr) {
        // Keep track of the largest value and how many times it appears.
        int max = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int value : arr) {
            if (value > max) {
                // A new largest value was found, so start counting its occurrences.
                max = value;
                maxCount = 1;
            } else if (value == max) {
                // Another copy of the largest value was found.
                maxCount++;
            }
        }

        // Every value except the largest ones is smaller than the maximum.
        return arr.length - maxCount;
    }
}
