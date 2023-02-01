def solution(k, score):
    result = []
    answer = []
    for i in score:
        result.append(i)
        if (len(result) > k):
            result.remove(min(result))
        answer.append(min(result))

    return answer