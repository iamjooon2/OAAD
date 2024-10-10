class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i += 1) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                
                index += 1;
            }
        }

        return index;
    }
}
