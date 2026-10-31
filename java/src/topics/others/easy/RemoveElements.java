package topics.others.easy;

import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args) {
        RemoveElements removeElements = new RemoveElements();

        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.err.println(removeElements.removeElement(nums, val));

    }

    public int removeElement(int[] nums, int val) {

        int K = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[K] = nums[i];
                K++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return K;
    }
}
