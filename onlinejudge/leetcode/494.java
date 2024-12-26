class Solution {

    private int answer;

    public int findTargetSumWays(int[] nums, int target) {
        answer = 0;
        dfs(0, 0, nums, target);
        return answer;
    }

    private void dfs(int index, int sum, int[] nums, int target) {
        if (index == nums.length) {
            if (sum == target) {
                answer += 1;
            }
            return;
        }

        dfs(index + 1, sum + nums[index], nums, target);
        dfs(index + 1, sum - nums[index], nums, target);
    }
}
