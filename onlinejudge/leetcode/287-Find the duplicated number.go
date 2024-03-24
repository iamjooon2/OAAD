func findDuplicate(nums []int) int {
	seen := make(map[int]bool)
	
	for _, num := range nums {
			if seen[num] {
					return num
			}
			seen[num] = true
	}
	
	return -1 // 만약 중복된 숫자가 없다면 -1을 반환할 수 있습니다.
}
