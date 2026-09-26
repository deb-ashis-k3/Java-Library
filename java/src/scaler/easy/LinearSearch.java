package scaler.easy;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = { 1, 2, 3, 4, 3, 2, 4, 5,3 };
        int target = 3;
        System.out.println(linearSearch.solve(arr, target));
    }

    public int solve(int[] arr, int target) {
        if (arr == null || arr.length <= 0)
            return 0;
        int count = 0;
        for (int value : arr) {
            count = value == target ? count += 1 : count;
        }
        return count;
    }
}
