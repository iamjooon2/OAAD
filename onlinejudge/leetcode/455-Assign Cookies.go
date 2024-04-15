func findContentChildren(g []int, s []int) int {
	sort.Ints(g)
	sort.Ints(s)

	childI := 0
	cookieJ := 0

	for childI < len(g) && cookieJ < len(s) {
		if s[cookieJ] >= g[childI] {
			childI += 1
		}
		cookieJ += 1
	}

	return childI
}
