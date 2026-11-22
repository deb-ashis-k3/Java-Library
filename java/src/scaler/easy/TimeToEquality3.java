package scaler.easy;

import java.util.HashMap;

public class TimeToEquality3 {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 2 };
        System.out.println(solution(arr));
    }

    static int solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int maxFrequency = 0;
        for (int value : arr) {
            int count = frequency.getOrDefault(value, 0) + 1;
            frequency.put(value, count);
            maxFrequency = Math.max(maxFrequency, count);
        }
        return arr.length - maxFrequency;
    }
}
