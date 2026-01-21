func uniqueOccurrences(arr []int) bool {
    frequency := make(map[int]int)

    for _, v := range arr {
        frequency[v] += 1
    }

    seen := make(map[int]bool)
    for _, count := range frequency {
        if seen[count] {
            return false
        }
        seen[count] = true
    }
    return true
}
