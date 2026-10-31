package topics.others.easy;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 17, 7, 15 };
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(arr, target)));

    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (hMap.containsKey(key)) {
                return new int[] { hMap.get(key), i };
            }
            hMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
