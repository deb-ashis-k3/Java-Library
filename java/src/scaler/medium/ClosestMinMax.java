package scaler.medium;

public class ClosestMinMax {

    public static void main(String[] args) {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        int[] arr = { 2, 6, 1, 6, 9 };
        System.out.println(closestMinMax.solve(arr));

    }

    public int solve(int[] arr) {
        if (arr == null)
            return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            min = Math.min(value, min);
            max = Math.max(value, max);
        }
        if (min == max)
            return -1;
        int minIdx = -1;
        int maxIdx = -1;
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                minIdx = i;
            }
            if (arr[i] == max) {
                maxIdx = i;
            }
            if (minIdx != -1 && maxIdx != -1) {
                size = Math.abs(minIdx - maxIdx) + 1;
            }

        }
        return size;
    }
}
