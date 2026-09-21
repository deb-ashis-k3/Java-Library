package scaler.easy;

import java.util.HashSet;

public class GoodPairs {
    public static void main(String[] args) {
        GoodPairs goodPairs = new GoodPairs();
        int [] list = {1,2,3,4,2};
        int target = 4;
        System.out.println(goodPairs.solve(list, target));
    }

    public int solve(int[] list, int B) {
        if (list == null || list.length <= 0)
            return 0;

        HashSet<Integer> hSet = new HashSet<>();
        for (int value : list) {
            int key = B - value;
            System.out.println(value);
            if (hSet.contains(key)) {
                return 1;
            }
            hSet.add(value);
        }
        return 0;
    }
}
