import sys

n, m = map(int, input().split())
check_arr = [-60] * (n+1)
ans = True

# 1 기록 차이가 60초 이상인지
# 2 시작 후 종료가 있는지
# 3 시작 없이 종료만 있는지

for j in range(m):
    t, i, state = map(int, sys.stdin.readline().split())
    if state == 0:
        if check_arr[i] != -60: # 시작하기도 전에 종료인 것인지 확인
            ans = False
            break
        check_arr[i] = t
    else:
        if check_arr[i] == -60:
            ans = False
            break
        if t - check_arr[i] < 60:
            ans = False
            break
        else:
            check_arr[i] = -60

for i in check_arr:
    if i != -60:
        ans = False
        break

# 답이 False라면
if ans:
    print("Yes")
else:
    print("No")