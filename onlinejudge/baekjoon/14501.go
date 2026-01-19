package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter(os.Stdout)
	defer writer.Flush()

	var n int
	fmt.Fscan(reader, &n)

	T := make([]int, n)
	P := make([]int, n)

	for i := 0; i < n; i += 1 {
		fmt.Fscan(reader, &T[i], &P[i])
	}
	dp := make([]int, n+1)

	for i := 0; i < n; i++ {
		// 1. 상담을 하는 경우: 상담이 기간 내에 끝나는지 확인
		if i+T[i] <= n {
			// 기존 값(dp[i+T[i]])과 이번 상담을 했을 때의 이익(dp[i]+P[i]) 중 큰 값 선택
			if dp[i]+P[i] > dp[i+T[i]] {
				dp[i+T[i]] = dp[i] + P[i]
			}
		}

		// 2. 상담을 하지 않고 날짜만 지나는 경우 (이전까지의 최대 수익을 다음 날로 전달)
		if dp[i] > dp[i+1] {
			dp[i+1] = dp[i]
		}
	}

	// 결과 출력
	fmt.Fprintln(writer, dp[n])
}
