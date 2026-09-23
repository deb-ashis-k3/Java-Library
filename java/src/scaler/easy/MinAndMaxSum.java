package scaler.easy;

public class MinAndMaxSum {
    public static void main(String[] args) {
        MinAndMaxSum mam = new MinAndMaxSum();
        int [] arr ={1,2,3,4,5,6,7};
        System.out.println("Result : "+ mam.solve(arr)); 
        
    }

    public int solve(int[] arr) {
        if (arr == null || arr.length <= 0)
            return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : arr) {
            min = Math.min(value, min);
            max = Math.max(value, max);
        }
        return (min + max);

    }
}
