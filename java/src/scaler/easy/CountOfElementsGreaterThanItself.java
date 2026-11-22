package scaler.easy;

public class CountOfElementsGreaterThanItself {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3 };
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        for (int value : arr) {
            if (value > max) {
                max = value;
                maxCount = 1;
            } else if (value == max) {
                maxCount++;
            }
        }
        return arr.length - maxCount;
    }
}
