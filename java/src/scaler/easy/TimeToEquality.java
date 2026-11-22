package scaler.easy;

public class TimeToEquality {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 2 };
        System.out.println(solution(arr));
    }

    static int solution(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        int sec = 0;
        for (int value : arr) {
            max = Math.max(value, max);
            sec += value;
        }
        return (arr.length * max) - sec;
    }
}
