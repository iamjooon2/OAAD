func findDuplicates(nums []int) []int {
	answers := make([]int, 0)
	maps := make(map[int]bool)

	for _, num := range nums {
		if maps[num] {
			answers = append(answers, num)
		} else {
			maps[num] = true
		}
	}

	return answers
}
