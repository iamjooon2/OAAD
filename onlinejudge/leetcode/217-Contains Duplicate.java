class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> nonDuplicates = new HashSet<Integer>();
        for (int num : nums) {
            nonDuplicates.add(num);
        }

        if (nums.length == nonDuplicates.size()) {
            return false;
        }
        return true;
    }
}