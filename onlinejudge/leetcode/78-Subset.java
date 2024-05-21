class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recursive(result, new ArrayList<>(), 0, nums);
        return result;
    }

    private static void recursive(
        List<List<Integer>> result,
        List<Integer> now,
        int index,
        int[] nums
    ) {
        // 재귀 종료 : 인덱스 다 태웠을 떄
        if (index == nums.length) {
            result.add(now);
            return;
        }

        recursive(result, new ArrayList<>(now), index + 1, nums);

        now.add(nums[index]);
        recursive(result, now, index + 1, nums);
    }
}
