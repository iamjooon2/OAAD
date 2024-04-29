def solution(s):
    answer = ''
    # 홀수일 때
    if len(s) % 2 == 1:
        answer = s[int((len(s)-1)/2)]
    # 짝수일 때
    else:
        answer = s[int((len(s))/2-1):int((len(s))/2+1)]
    return answer