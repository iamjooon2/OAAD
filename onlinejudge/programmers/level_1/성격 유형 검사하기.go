var points = map[int]int{
	1: 3,
	2: 2,
	3: 1,
	4: 0,
	5: 1,
	6: 2,
	7: 3,
}

var score = map[string]int{}

func solution(survey []string, choices []int) string {
	for i := 0; i < len(survey); i++ {
		split := survey[i]
		unAgree := string(split[0])
		agree := string(split[1])
		point := choices[i]
		judge(point, unAgree, agree)
	}

	answer := makeAnswer()
	return answer
}

func judge(choice int, unAgree string, agree string) {
	if choice < 4 {
		score[unAgree] += points[choice]
	} else if choice > 4 {
		score[agree] += points[choice]
	}
}

func makeAnswer() string {
	answer := ""
	if score["R"] < score["T"] {
		answer += "T"
	} else {
		answer += "R"
	}

	if score["C"] < score["F"] {
		answer += "F"
	} else {
		answer += "C"
	}

	if score["J"] < score["M"] {
		answer += "M"
	} else {
		answer += "J"
	}

	if score["A"] < score["N"] {
		answer += "N"
	} else {
		answer += "A"
	}
	return answer
}
