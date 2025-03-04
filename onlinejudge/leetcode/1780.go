func CheckPowersOfThree(n int) bool {
    for n > 0 {
        if n%3 == 2 { // 3진법 변환 시 '2'가 나오면 불가능
            return false
        }
        n /= 3
    }
    return true
}