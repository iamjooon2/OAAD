func firstUniqChar(s string) int {
	runeCount := make(map[rune]int)

	for _, r := range s {
		runeCount[r]++
	}

	for i, r := range s {
		if runeCount[r] == 1 {
			return i
		}
	}

	return -1
}
