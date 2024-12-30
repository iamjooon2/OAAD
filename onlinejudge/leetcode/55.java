class Solution {
    public boolean canJump(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i += 1) {
            if (i > index) {
                return false;
            }
            index = Math.max(index, nums[i] + i);
        }
        return true;
    }
}
