class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length - 2; i += 1) {
            for (int j = i + 1; j < nums.length - 1; j += 1) {
                for (int k = j + 1; k < nums.length; k += 1) {
                    long target = 1L * (nums[i] - nums[j]) * nums[k];
                    max = Math.max(max, target);
                }
            }
        }

        return max > 0 ? max : 0;
    }
}
