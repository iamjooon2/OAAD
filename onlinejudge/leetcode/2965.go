
func findMissingAndRepeatedValues(grid [][]int) [2]int {
	n := len(grid) * len(grid)
	set := make(map[int]bool)
	answer := [2]int{}

	for _, row := range grid {
		for _, num := range row {
			if set[num] {
				answer[0] = num
				break
			}
			set[num] = true
		}
	}

	for i := 1; i <= n; i++ {
		if !set[i] {
			answer[1] = i
			break
		}
	}

	return answer
}
