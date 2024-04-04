
func solution(order []int) int {
	answer := 0
	priority := make([]int, len(order))

	for i := 0; i < len(order); i += 1 {
		priority[order[i]-1] = i
	}

	var sub []int
	for i := 0; i < len(priority); i += 1 {
		if priority[i] == answer {
			answer += 1
		} else {
			sub = append(sub, priority[i])
		}

		for len(sub) > 0 && sub[len(sub)-1] == answer {
			sub = sub[:len(sub)-1]
			answer += 1
		}
	}
	return answer
}
