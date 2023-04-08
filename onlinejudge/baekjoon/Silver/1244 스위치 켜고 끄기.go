package main

import "fmt"

func main() {
    var n int
    fmt.Scan(&n)

    switches := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&switches[i])
    }

    var students int
    fmt.Scan(&students)
    for i := 0; i < students; i++ {
        var gender, targetIndex int
        fmt.Scan(&gender, &targetIndex)
        targetIndex -= 1

        if gender == 1 {
            boys(switches, targetIndex)
        }

        if gender == 2 {
            girls(switches, targetIndex)
        }
    }

    printResult(switches)
}

func girls(switches []int, targetIndex int) {
    switches[targetIndex] = convert(switches[targetIndex])
    count := 1
    for (targetIndex-count) >= 0 && (targetIndex+count) < len(switches) {
        if switches[targetIndex+count] == switches[targetIndex-count] {
            switches[targetIndex-count] = convert(switches[targetIndex-count])
            switches[targetIndex+count] = convert(switches[targetIndex+count])

            count += 1
        } else {
            break
        }
    }
}

func boys(switches []int, targetIndex int) {
    for j := 0; j < len(switches); j++ {
        if (j+1)%(targetIndex+1) == 0 {
            switches[j] = convert(switches[j])
        }
    }
}

func printResult(switches []int) {
    for i := 1; i <= len(switches); i++ {
        fmt.Printf("%d ", switches[i-1])
        if i%20 == 0 {
            fmt.Println()
        }
    }
}

func convert(switchStatus int) int {
    if switchStatus == 0 {
        return 1
    }
    return 0
}
