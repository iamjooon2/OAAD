package main

import (
	"fmt"
	"strings"
)

func main() {
	var line string
	fmt.Scanln(&line)
	words := strings.Split(line, " ")

	if len(words) == 0 {
		fmt.Println(0)
	} else if words[0] == "" {
		fmt.Println(len(words) - 1)
	} else {
		fmt.Println(len(words))
	}
}
