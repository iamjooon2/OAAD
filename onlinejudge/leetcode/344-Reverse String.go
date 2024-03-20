func reverseString(s []byte) {
	for i := 0; i < len(s)/2; i += 1 {
		temp := s[i]
		s[i] = s[len(s)-1-i]
		s[len(s)-1-i] = temp
	}
}