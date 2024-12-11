class Solution {
    public void rotate(int[] nums, int k) {
        // pruning the k case
        if (k == 0) {
            return;
        }

        List<Integer> arr = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toList());

        Collections.rotate(arr, k);

        for (int i = 0; i < arr.size(); i += 1) {
            nums[i] = arr.get(i);
        }

    }
}
