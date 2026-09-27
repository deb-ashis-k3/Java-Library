package scaler.medium;

public class EquilibriumIndexOfAnArray {
    public static void main(String[] args) {

        EquilibriumIndexOfAnArray equilibriumIndexOfAnArray = new EquilibriumIndexOfAnArray();
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(equilibriumIndexOfAnArray.solve(arr));

    }

    public int solve(int[] arr) {
        if (arr == null)
            return -1;

        int totalSum = 0;
        for (int value : arr) {
            totalSum += value;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int rightSum = totalSum - leftSum - current;
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += current;
        }

        return -1;
    }
}
