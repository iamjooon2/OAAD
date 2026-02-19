func toggleLightBulbs(bulbs []int) []int {
	counts := make(map[int]int)
	for _, bulb := range bulbs {
		counts[bulb] += 1
	}

	var answer []int
	for bulb, cnt := range counts {
		if cnt&1 != 0 {
			answer = append(answer, bulb)
		}
	}

	sort.Ints(answer)
	return answer
}
