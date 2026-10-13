package topics.slidingWindow.easy;

public class MinimumSwaps {
    public static void main(String[] args) {
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        int[] arr = { 1, 12, 10, 3, 14, 10, 5 };
        int B = 8;
        System.out.println(minimumSwaps.solve(arr, B));
        System.out.println(minimumSwaps.solveOp(arr, B));
    }

    public int solve(int[] arr, int B) {

        int N = arr.length;
        int goodEle = 0;
        for (int value : arr)
            goodEle = value <= B ? goodEle + 1 : goodEle;

        if (goodEle == 0 || goodEle == N)
            return 0;

        int minSwaps = Integer.MAX_VALUE;

        for (int i = 0; i < N - goodEle; i++) {
            int badCount = 0;
            for (int j = i; j < i + goodEle; j++) {
                if (arr[j] > B)
                    badCount++;
            }
            minSwaps = Math.min(minSwaps, badCount);
        }

        return minSwaps;

    }

    public int solveOp(int[] arr, int B) {

        int N = arr.length;
        int goodCount = 0;
        for (int value : arr) {
            goodCount = value <= B ? goodCount + 1 : goodCount;
        }
        if (goodCount == 0 || goodCount == N)
            return 0;

        int badCount = 0;

        for (int i = 0; i < goodCount; i++) {
            if (arr[i] > B)
                badCount++;
        }
        int minSwaps = badCount;

        for (int i = goodCount; i < N; i++) {
            if (arr[i - goodCount] > B)
                badCount--;
            if (arr[i] > B)
                badCount++;
            minSwaps = Math.min(minSwaps, badCount);
        }
        return minSwaps;

    }

}
