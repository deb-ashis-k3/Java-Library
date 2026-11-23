package scaler.easy;


public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { -2, 4, 1, 5, 2 };
        System.out.println(getIndexBasedSum(arr, 1, 2));
    }

    static long getIndexBasedSum(int[] arr, int left, int right) {
        if (arr == null || arr.length == 0) {
            return 0L;
        }
        long[] prefixArr = new long[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i - 1];
        }

        return prefixArr[right + 1] - prefixArr[left];
    }
}
