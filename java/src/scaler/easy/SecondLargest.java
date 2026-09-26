package scaler.easy;

public class SecondLargest {
    public static void main(String[] args) {
        SecondLargest secondLargest = new SecondLargest();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(secondLargest.solve(arr));

    }

    public int solve(int[] arr) {
        if (arr == null || arr.length <= 0)
            return 0;
        int max = -1;
        int secondLargest = -1;
        for (int value : arr) {
            if (value > max) {
                secondLargest = max;
                max = value;
            } else if (secondLargest < value && value != max) {
                secondLargest = value;
            }
        }
        return secondLargest;
    }
}
