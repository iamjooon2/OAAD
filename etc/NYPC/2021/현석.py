n, m = map(int, input().split())  # n, m을 입력받습니다.
check_set = [[0, 0]] * (n+1) # check_set이라는 리스트를 2차원 배열로 만듭니다.

for j in range(m):
    t, i, state = map(int, input().split())
    if state == 0:  # 만약 state가 0이면
        if check_set[i][1] == 1:  # 만약 check_set[i][1]이 1이라면...
            print("NO")  # NO를 출력합니다.
        check_set[i] = [t, 1]  # check_set[i]를 [t, 1]로 정합니다.

    else:  # 아니라면...
        if check_set[i][1] == 0:  # 만약 check_set[i][1]가 0이라면...
            print("NO")  # NO를 출력합니다.
        elif t - check_set[i][0] < 60:  # 만약 t-check_set[i][0]이 60보다 작다면...
            print("NO")  # NO를 출력합니다.
        else:  # 아니라면...
            check_set[i] = [0, 0]  # check_set[i]를 [0,0]으로 정하기

for k in range(1, n + 1):  # k를 1씩 계속 더하며 1~n이 될때까지 반복합니다.
    if check_set[k][1] == 1:  # 만약 check_set[k][1]이 1이라면...
        print("NO")  # NO를 출력합니다.
print("YES")  # YES를 출력합니다.