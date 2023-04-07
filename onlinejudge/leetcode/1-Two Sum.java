class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        
        for (int i = 0; i < nums.length - 1; i += 1) {
            for (int j = i + 1; j < nums.length; j += 1) {
                if (nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}