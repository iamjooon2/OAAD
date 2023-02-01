package level_1

import (
	"strconv"
)

func solution(seoul []string) string {
	var a int = 0
	for i := 1; i < len(seoul); i += 1 {
		if seoul[i] == "Kim" {
			a = i
		}
	}
	return "김서방은 " + strconv.Itoa(a) + "에 있다"
}
