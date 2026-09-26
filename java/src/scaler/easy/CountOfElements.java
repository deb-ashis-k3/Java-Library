package scaler.easy;

public class CountOfElements {
    public static void main(String[] args) {
        CountOfElements countOfElements = new CountOfElements();
        int[] arr = { 3, 4, 2, 4, 1 };
        System.out.println(countOfElements.solve(arr));

    }

    public int solve(int[] arr) {
        if (arr == null || arr.length <= 0)
            return 0;
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > max) {
                max = value;
                count = 1;
            } else if (value == max) {
                count++;
            }
        }
        return arr.length - count;
    }
}
