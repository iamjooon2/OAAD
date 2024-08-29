func solution(cards1 []string, cards2 []string, goal []string) string {
    
	cards1Index := 0
	cards2Index := 0

	for _, word := range goal {
		if cards1Index < len(cards1) && cards1[cards1Index] == word {
			cards1Index++
			continue
		} else if cards2Index < len(cards2) && cards2[cards2Index] == word {
			cards2Index++
			continue
		} else {
			return "No"
		}
	}

	return "Yes"
}
