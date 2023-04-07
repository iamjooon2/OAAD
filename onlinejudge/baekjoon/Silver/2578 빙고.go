package main

import "fmt"

func main() {
    var table [5][5]int
    var bingoCount int

    for i := 0; i < 5; i++ {
        for j := 0; j < 5; j++ {
            fmt.Scan(&table[i][j])
        }
    }

    for count := 1; count <= 25; count++ {
        var answer int
        fmt.Scan(&answer)

        for i := 0; i < 5; i++ {
            for j := 0; j < 5; j++ {
                if table[i][j] == answer {
                    table[i][j] = 0
                }
            }
        }

        bingoCount += checkVertical(table)
        bingoCount += checkHorizontal(table)
        bingoCount += checkRightUpDiagonal(table)
        bingoCount += checkRightDownDiagonal(table)

        if bingoCount >= 3 {
            fmt.Println(count)
            break
        }
        bingoCount = 0
    }
}

func checkVertical(table [5][5]int) int {
    bingoCount := 0
    for i := 0; i < 5; i++ {
        zeroCount := 0
        for j := 0; j < 5; j++ {
            if table[i][j] == 0 {
                zeroCount += 1
            }
            if zeroCount == 5 {
                bingoCount += 1
            }
        }
    }
    return bingoCount
}

func checkHorizontal(table [5][5]int) int {
    bingoCount := 0
    for i := 0; i < 5; i++ {
        zeroCount := 0
        for j := 0; j < 5; j++ {
            if table[j][i] == 0 {
                zeroCount += 1
            }
            if zeroCount == 5 {
                bingoCount += 1
            }
        }
    }
    return bingoCount
}

func checkRightUpDiagonal(table [5][5]int) int {
    bingoCount := 0
    zeroCount := 0
    for i := 0; i < 5; i++ {
        if table[i][i] == 0 {
            zeroCount += 1
        }
    }
    if zeroCount == 5 {
        bingoCount += 1
    }
    return bingoCount
}

func checkRightDownDiagonal(table [5][5]int) int {
    bingoCount := 0
    zeroCount := 0
    for i := 0; i < 5; i++ {
        if table[i][4-i] == 0 {
            zeroCount += 1
        }
    }
    if zeroCount == 5 {
        bingoCount += 1
    }
    return bingoCount
}