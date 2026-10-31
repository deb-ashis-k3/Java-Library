package topics.others.easy;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        SumOfAllSubArrays sumOfAllSubArrays = new SumOfAllSubArrays();
        int[] arr = { 3, 2, 4, 1, 2, 6, 8, 1 };
        System.out.println(sumOfAllSubArrays.solve(arr));

    }

    public long solve(int[] arr) {
        int N = arr.length;
        if (arr == null || N <= 0) {
            return 0;
        }
        long sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Occurance of index : " + i + " = " + (i + 1) * (N - i));
            sum += arr[i] * (i + 1) * (N - i);
        }
        return sum;
    }

}
