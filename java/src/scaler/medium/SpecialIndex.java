package scaler.medium;


public class SpecialIndex {
    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 6, -2 };
        SpecialIndex specialIndex = new SpecialIndex();
        System.out.println(specialIndex.solve(arr));

    }

    public int solve(int[] arr) {
        if (arr == null)
            return 0;

        int arrLen = arr.length;
        int[] prefixEvenArr = new int[arrLen + 1];
        int[] prefixOddArr = new int[arrLen + 1];

        for (int i = 0; i < arrLen; i++) {
            prefixEvenArr[i + 1] = prefixEvenArr[i];
            prefixOddArr[i + 1] = prefixOddArr[i];
            if (i % 2 == 0) {
                prefixEvenArr[i + 1] += arr[i];
            } else {
                prefixOddArr[i + 1] += arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < arrLen; i++) {
            int evenSum = prefixEvenArr[i] + (prefixOddArr[arrLen] - prefixOddArr[i + 1]);
            int oddSum = prefixOddArr[i] + (prefixEvenArr[arrLen] - prefixEvenArr[i + 1]);
            if(evenSum== oddSum)count++;
        }
        return count;
    }

}
