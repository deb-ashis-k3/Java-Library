package scaler.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        UniqueElements uniqueElements = new UniqueElements();
        int[] arr = { 3, 3, 3, 9, 0, 1, 0 };
        System.out.println(uniqueElements.solve(arr));
    }

    public int solve(int[] arr) {
        if (arr == null)
            return 0;

        Set<Integer> hset = new HashSet<>();
        int count = 0;
        for (int value : arr) {
            if (!hset.contains(value)) {
                hset.add(value);
                count++;
            }
        }
        return count;
    }
}
