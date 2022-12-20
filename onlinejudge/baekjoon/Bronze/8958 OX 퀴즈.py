N = int(input())

for i in range(N):
    line = list(input())
    result = 0 #0의 개수를 출력할 변수
    score = 0 #0의 개수를 점수화 할 변수
    for j in line:
        if j == 'O':
            score = score + 1
        else:
            score = 0
        result = result + score
    print(result)