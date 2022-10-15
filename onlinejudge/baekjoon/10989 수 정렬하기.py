import sys

input = sys.stdin.readline

n = int(input())
# 10000개 이하의 숫자만 주는게 포인트...이지 않을까?
arr = [0] * 10001
for i in range(n):
    num = int(input())
    # arr[num]에 들어온 개수를 넣어준다
    arr[num] += 1

for j in range(1, 10001):
    # 해당 인덱스에 숫자가 들어있으면
    while arr[j]:
        # 프린트해주고
        print(j)
        # 인덱스를 하나 빼 줌
        arr[j] -= 1