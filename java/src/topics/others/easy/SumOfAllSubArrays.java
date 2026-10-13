package topics.others.easy;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        SumOfAllSubArrays sumOfAllSubArrays = new SumOfAllSubArrays();
        int[] arr = { 4, 5, 6 };
        System.out.println(sumOfAllSubArrays.solve(arr));

    }

    public long solve(int[] arr) {
        int N = arr.length;
        if (arr == null || N <= 0) {
            return 0;
        }
        long sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + " * " + (i + 1) + " * " + (N - i)+" = " +(arr[i]* (i + 1) * (N - i)));
            sum += arr[i] * (i + 1) * (N - i);
        }
        return sum;
    }

}
