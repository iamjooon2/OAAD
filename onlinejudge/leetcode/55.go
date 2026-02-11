func canJump(arr []int) bool {
	dp := make([]bool, len(arr))
	
	dp[0] = true
	lastTrue := 0

	for i := 0; i < len(arr); i += 1 {
		if dp[i] {
			newLastTrue := lastTrue

			for j := lastTrue + 1; j <= i + arr[i] && j < len(arr); j += 1 {
				dp[j] = true
				newLastTrue = j
			}
			lastTrue = newLastTrue
		}
	}
	
	return dp[n-1]
}
