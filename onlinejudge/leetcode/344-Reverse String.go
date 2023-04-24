func reverseString(s []byte) {
	stack := []byte{}

	for i := 0; i < len(s); i++ {
			stack = append(stack, s[i])
	}

	for i := 0; i < len(s); i++ {
			s[i] = stack[len(stack)-1]
			stack = stack[:len(stack)-1]
	}
}