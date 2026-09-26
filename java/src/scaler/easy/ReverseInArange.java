package scaler.easy;

import java.util.Arrays;

public class ReverseInArange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ReverseInArange reverseInArange = new ReverseInArange();
        System.out.println(Arrays.toString(reverseInArange.solve(arr, 0, 1)));

    }

    public int[] solve(int[] arr, int from, int to) {
        if (arr == null || arr.length <= 1)
            return arr;

        while (from < to) {
            int temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;
            from++;
            to--;
        }

        return arr;
    }
}
