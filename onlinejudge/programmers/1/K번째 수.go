import (
	"sort"
)

func solution(array []int, commands [][]int) []int {
	answer := make([]int, len(commands))
	index := 0

	for _, element := range commands {
		startIndex := element[0] - 1
		endIndex := element[1]
		targetIndex := element[2] - 1

		result := make([]int, endIndex-startIndex)
		copy(result, array[startIndex:endIndex])

		sort.Ints(result)
        
		answer[index] = result[targetIndex]
		index++
	}

	return answer
}
