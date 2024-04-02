
func solution(order []int) int {
	answer := 0
	priority := make([]int, len(order))

	for i := 0; i < len(order); i++ {
		priority[order[i]-1] = i
	}

	var sub []int
	for i := 0; i < len(priority); i++ {
		if priority[i] == answer {
			answer++
		} else {
			sub = append(sub, priority[i])
		}

		for len(sub) > 0 && sub[len(sub)-1] == answer {
			sub = sub[:len(sub)-1]
			answer++
		}
	}
	return answer
}
