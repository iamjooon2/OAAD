func lengthOfLastWord(s string) int {
	trimmed := strings.TrimSpace(s)
	if trimmed == "" {
			return 0
	}
	words := strings.Split(trimmed, " ")
	lastWord := words[len(words)-1]
	return len(lastWord)    
}
