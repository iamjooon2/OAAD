class Solution {
    // time complexity => O(n log M)
    public int minCapability(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (canRob(nums, k, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        
        return min;
    }

    private boolean canRob(int[] nums, int k, int m) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i += 1) {
            if (nums[i] <= m) {
                count += 1;
                i += 1;
            }
        }

        return count >= k;
    }
        
}
