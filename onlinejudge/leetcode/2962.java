class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums)
                        .max()
                        .getAsInt();
        int count = 0;
        int left = 0;

        long result = 0;
        for (int i = 0; i < nums.length; i += 1) {
            if (nums[i] == max) {
                count += 1;
            }
            
            while (count == k) {
                if (nums[left++] == max) {
                    count -= 1;
                }
            }
            result += left;
        }

        return result;
    }
}

