package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)

	var n int
	fmt.Fscanln(reader, &n)

	mapArr := make([][]byte, n)
	statusArr := make([][]byte, n)
	answerArr := make([][]int, n)
	for i := 0; i < n; i++ {
		mapArr[i] = make([]byte, n)
		statusArr[i] = make([]byte, n)
		answerArr[i] = make([]int, n)
	}

	for i := 0; i < n; i++ {
		x, _ := reader.ReadString('\n')
		for j := 0; j < n; j++ {
			mapArr[i][j] = x[j]
		}
	}

	for i := 0; i < n; i++ {
		x, _ := reader.ReadString('\n')
		for j := 0; j < n; j++ {
			statusArr[i][j] = x[j]
			answerArr[i][j] = 0
		}
	}

	calculateBombCount(n, mapArr, answerArr)

	if validateLose(statusArr, mapArr, n) {
		loserView(n, mapArr, statusArr, answerArr)
	} else {
		winnerView(n, mapArr, statusArr, answerArr)
	}
}

func calculateBombCount(n int, mapArr [][]byte, answerArr [][]int) {
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if mapArr[i][j] == '*' {
				calculateStraight(n, answerArr, i, j)
				calculateDiagonal(n, answerArr, i, j)
			}
		}
	}
}

func calculateStraight(n int, answerArr [][]int, i int, j int) {
	if i-1 >= 0 {
		answerArr[i-1][j] += 1
	}
	if i+1 < n {
		answerArr[i+1][j] += 1
	}
	if j-1 >= 0 {
		answerArr[i][j-1] += 1
	}
	if j+1 < n {
		answerArr[i][j+1] += 1
	}
}

func calculateDiagonal(n int, answerArr [][]int, i int, j int) {
	if i-1 >= 0 && j-1 >= 0 {
		answerArr[i-1][j-1] += 1
	}
	if i-1 >= 0 && j+1 < n {
		answerArr[i-1][j+1] += 1
	}
	if i+1 < n && j-1 >= 0 {
		answerArr[i+1][j-1] += 1
	}
	if i+1 < n && j+1 < n {
		answerArr[i+1][j+1] += 1
	}
}

func validateLose(statusArr [][]byte, mapArr [][]byte, n int) bool {
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if statusArr[i][j] == 'x' && mapArr[i][j] == '*' {
				return true
			}
		}
	}
	return false
}

func loserView(n int, mapArr [][]byte, statusArr [][]byte, answerArr [][]int) {
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if mapArr[i][j] == '*' {
				fmt.Print("*")
			} else if statusArr[i][j] == '.' && mapArr[i][j] == '.' {
				fmt.Print(".")
			} else if statusArr[i][j] == 'x' && mapArr[i][j] == '.' {
				fmt.Print(answerArr[i][j])
			}
		}
		fmt.Println()
	}
}

func winnerView(n int, mapArr [][]byte, status [][]byte, answer [][]int) {
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if status[i][j] == '.' {
				fmt.Print(".")
			} else if status[i][j] == 'x' && mapArr[i][j] == '.' {
				fmt.Print(answer[i][j])
			}
		}
		fmt.Println()
	}
}
