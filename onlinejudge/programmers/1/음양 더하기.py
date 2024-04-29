def solution(absolutes, signs):
    answer = 0
    for i in range(len(signs)):
        if signs[i] == False:
            absolutes[i] = absolutes[i] * -1
    for i in range(len(absolutes)):
        answer += absolutes[i]
    return answer