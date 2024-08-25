package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

func main() {
	result := make(map[string]int)
	scanner := bufio.NewScanner(os.Stdin)
	
	var N int
	fmt.Scan(&N)

	for i := 0; i < N; i++ {
		scanner.Scan()
		input := scanner.Text()
		result[input]++
	}

	var answer string
	max := 0
	for key, value := range result {
		if value > max {
			answer = key
			max = value
		} else if value == max {
			if key < answer {
				answer = key
			}
		}
	}
	fmt.Println(answer)
}

