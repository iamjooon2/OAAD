package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	H, W, X, Y int
	ARR_A, ARR_B [][]int
	scanner *bufio.Scanner
)

func main() {
	initialize()
	recover()
	printAnswer()
}

func initialize() {
	scanner = bufio.NewScanner(os.Stdin)
	scanner.Scan()
	input := strings.Fields(scanner.Text())
	H, _ = strconv.Atoi(input[0])
	W, _ = strconv.Atoi(input[1])
	X, _ = strconv.Atoi(input[2])
	Y, _ = strconv.Atoi(input[3])

	ARR_A = make([][]int, H)
	for i := range ARR_A {
		ARR_A[i] = make([]int, W)
	}

	ARR_B = make([][]int, H+X)
	for i := range ARR_B {
		ARR_B[i] = make([]int, W+Y)
		scanner.Scan()
		row := strings.Fields(scanner.Text())
		for j := range row {
			ARR_B[i][j], _ = strconv.Atoi(row[j])
		}
	}
}

func recover() {
	for i := 0; i < H; i++ {
		for j := 0; j < W; j++ {
			if i >= X && j >= Y {
				ARR_A[i][j] = ARR_B[i][j] - ARR_A[i-X][j-Y]
			} else {
				ARR_A[i][j] = ARR_B[i][j]
			}
		}
	}
}

func printAnswer() {
	for _, line := range ARR_A {
		for _, element := range line {
			fmt.Print(element, " ")
		}
		fmt.Println()
	}
}
