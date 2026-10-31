package topics.others.easy;


public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.err.println(removeDuplicatesFromSortedArray.removeDuplicates(arr));

    }
    
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
