func maximumWealth(accounts [][]int) int {
	result := 0
	for i := 0; i < len(accounts); i++ {
			temp := 0
			for j := 0; j < len(accounts[i]); j++ {
					temp += accounts[i][j]
			}
			if temp > result {
					result = temp
			}
	}
	return result
}
