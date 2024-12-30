class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i += 1) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;

            for (int j = 0; j < nums.length; j += 1) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            nums[minIndex] *= multiplier;
        }

        return nums;
    }
}
