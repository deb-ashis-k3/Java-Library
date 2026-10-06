package scaler.easy;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        SumOfAllSubArrays sumOfAllSubArrays = new SumOfAllSubArrays();
        int[] arr = { 1, 2, 3 };
        System.out.println(sumOfAllSubArrays.solve(arr));

    }

    public long solve(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        int n = arr.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
}
