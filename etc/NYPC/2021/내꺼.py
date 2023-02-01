n, m = map(int, input().split())
check_arr = [-60] * (n+1)
ans = True

# 1 기록 차이가 60초 이상인지
# 2 시작 후 종료가 있는지
# 3 시작 없이 종료만 있는지

for j in range(m):
    t, i, state = map(int, input().split())
    if state == 0: #시작은 했으나
        if check_arr[i] != -60: # 종료를 하지 않았는지
            ans = False
            break
        check_arr[i] = t
    else:
        if check_arr[i] == -60: # 시작 없이 종료만 있는지
            ans = False
            break
        if t - check_arr[i] < 60: # 기록 차이가 60초 이상 나는지
            ans = False
            break
        else:
            check_arr[i] = -60

# 담겨진 array를 반복하며 확인
for i in check_arr:
    if i != -60:
        ans = False
        break

if ans:
    print("Yes")
else:
    print("No")