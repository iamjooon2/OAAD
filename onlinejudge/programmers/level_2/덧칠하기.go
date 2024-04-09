func solution(n int, m int, section []int) int {
	answer := 0
	position := 1
	
	for i := 0; i < len(section); i += 1 {
			if position <= section[i] {
					answer += 1
					position = section[i] + m
			}
	}
	
	return answer
}
