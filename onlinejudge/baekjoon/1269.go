package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	line, _ := reader.ReadString('\n')
	numbers := strings.Fields(line)

	A, _ := strconv.Atoi(numbers[0])
	B, _ := strconv.Atoi(numbers[1])

	setA := make(map[int]struct{})
	setB := make(map[int]struct{})

	line, _ = reader.ReadString('\n')
	numsA := strings.Fields(line)
	for i := 0; i < A; i++ {
		num, _ := strconv.Atoi(numsA[i])
		setA[num] = struct{}{}
	}

	line, _ = reader.ReadString('\n')
	numsB := strings.Fields(line)
	for i := 0; i < B; i++ {
		num, _ := strconv.Atoi(numsB[i])
		setB[num] = struct{}{}
	}

	resultA := len(setA)
	for element := range setA {
		if _, found := setB[element]; found {
			resultA--
		}
	}

	resultB := len(setB)
	for element := range setB {
		if _, found := setA[element]; found {
			resultB--
		}
	}

	fmt.Println(resultA + resultB)
}
