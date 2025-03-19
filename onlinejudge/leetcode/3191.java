class Solution {
    public int minOperations(int[] nums) {
        int count = 0;

        for (int i = 0; i <= nums.length - 3; i += 1) {
            if (nums[i] == 0) {
                for (int j = 0; j < 3; j += 1) {
                    nums[i + j] = nums[i + j] == 0 ? 1 : 0;
                }
                count += 1;
            }
        }

        for (int num : nums) {
            if (num == 0) {
                return -1;
            }
        }

        return count;
    }
}
