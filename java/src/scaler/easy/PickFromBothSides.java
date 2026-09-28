package scaler.easy;

public class PickFromBothSides {
    public static void main(String[] args) {
        int [] arr ={2, 3, -1, 4, 2, 1 };
        int operation =4;

        PickFromBothSides pickFromBothSides = new PickFromBothSides();
        System.out.println(pickFromBothSides.solve(arr, operation));
        

    }

    public int solve(int[] arr, int operation) {
        int arrLen = arr.length;

        int[] prefixArr = new int[arrLen + 1];
        for (int i = 0; i < arrLen; i++) {
            prefixArr[i + 1] = prefixArr[i] + arr[i];
        }
        int maxSum= Integer.MIN_VALUE;
        
        for(int i=0; i<=operation; i++){
            int right = operation-i;
            int leftSum= prefixArr[i];
            int rightSum = prefixArr[arrLen]- prefixArr[arrLen- right];
            int currentSum= leftSum+ rightSum;
            maxSum= Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
