func longestCommonPrefix(strs []string) string {
		sort.Strings(strs)

		firstText := strs[0]
		lastText := strs[len(strs)-1]

		idx := 0
		for idx < len(firstText) && idx < len(lastText) {
				if firstText[idx] == lastText[idx] {
						idx++
				} else {
						break
				}
		}

		return firstText[:idx]
}
