func solution(players []string, callings []string) []string {
	rank := make(map[string]int, len(players))
	answer := make([]string, len(players))

	for i, player := range players {
		rank[player] = i
	}

	for _, chaser := range callings {
		index := rank[chaser]
		target := players[index-1]

		players[index] = target
		players[index-1] = chaser

		rank[target] = index
		rank[chaser] = index - 1
	}

	for player, index := range rank {
		answer[index] = player
	}

	return answer
}