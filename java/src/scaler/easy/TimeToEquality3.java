package scaler.easy;

import java.util.HashMap;

public class TimeToEquality3 {
    // Run the example and print how many values must be changed to make all values equal.
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 2 };
        System.out.println(solution(arr));
    }

    // Return the fewest array elements that need to be replaced to make all values equal.
    static int solution(int[] arr) {

        // An empty array has no values to change.
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Store how many times each number has appeared.
        HashMap<Integer, Integer> frequency = new HashMap<>();

        // The most common number is the best one to keep unchanged.
        int maxFrequency = 0;

        for (int value : arr) {
            // Count this occurrence and update the largest count seen so far.
            int count = frequency.getOrDefault(value, 0) + 1;
            frequency.put(value, count);
            maxFrequency = Math.max(maxFrequency, count);
        }

        // Keep the most common value; replace every other element.
        return arr.length - maxFrequency;
    }
}
