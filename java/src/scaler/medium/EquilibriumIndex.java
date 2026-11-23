package scaler.medium;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(getEquilibriumIndex(arr));
    }

    static int getEquilibriumIndex(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int n = arr.length;
        long totalSum = 0;
        long leftSum = 0;

        for (int value : arr) {
            totalSum += value;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Total Sum : " + totalSum);
            System.out.println("Left Sum : " + leftSum);
            
            long rightSum = totalSum - leftSum - arr[i];
            System.out.println("Right Sum : " + rightSum);
            System.err.println("--------------------\n");
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;

    }
}
