func searchInsert(nums []int, target int) int {
	for i := 0; i < len(nums); i += 1 {
			if nums[i] >= target {
					return i;
			}
	}
	return len(nums);
}
