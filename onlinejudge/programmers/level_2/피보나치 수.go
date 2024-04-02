func solution(n int) int {
	arr := make([]int, n+1)
	arr[0] = 0
	arr[1] = 1

	for i := 2; i <= n; i += 1 {
			arr[i] = (arr[i-1] + arr[i-2]) % 1234567
	}

	return arr[n]
}
