class Solution {
    public int findMin(int[] nums) {
        return IntStream.of(nums).min().getAsInt();
    }
}
