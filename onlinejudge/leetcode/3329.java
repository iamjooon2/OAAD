class Solution {
    public int countSubarrays(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < nums.length - 2; i += 1) {
            int first = nums[i];
            int second = nums[i + 1];
            int third = nums[i + 2];

            int target = (first + third) * 2;

            if (second == target) {
                System.out.println(second);
                System.out.println(target);
                count += 1;
            }
        }

        return count;
    }
}
