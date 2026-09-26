package scaler.easy;

public class TimeToEquality {
    public static void main(String[] args) {
        TimeToEquality timeToEquality = new TimeToEquality();
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(timeToEquality.solve(arr));
    }

    public int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sec = 0;
        for (int value : arr) {
            max = Math.max(value, max);
            sec += max;
        }
        return ((max * arr.length) - sec);
    }
}
