class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;

        Set<Integer> totalSet = new HashSet<>();
        for (int num : nums) {
            totalSet.add(num);
        }
        int totalDistinct = totalSet.size();

        int count = 0;
        for (int i = 0; i < n; i += 1) {
            Set<Integer> windowSet = new HashSet<>();
            for (int j = i; j < n; j += 1) {
                windowSet.add(nums[j]);

                if (windowSet.size() == totalDistinct) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
