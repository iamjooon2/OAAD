class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums); 

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int max = 0;
        for (int i = 0; i < nums.length; i += 1) {
            for (int j = 0; j < i; j += 1) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[max] < dp[i]) {
                max = i;
            }
        }

        int m = dp[max];
        List<Integer> arr = new ArrayList<>();
        for (int i = max; m > 0; i -= 1) {
            if (nums[max] % nums[i] == 0 && dp[i] == m) {
                arr.add(nums[i]);
                max = i;
                m -= 1;
            }
        }

        return arr.isEmpty() 
                ? Arrays.asList(nums[0]) 
                : arr;
    }
}
