K, N = map(int, input().split())
arr = []
for i in range(K):
    arr.append(int(input()))

# 길이의 범위는 1부터 랜선 중 가장 긴 길이 중 하나
start = 1
end = max(arr)
while start <= end:
    mid = (start + end) // 2

    count = 0
    for i in range(K):
        count += arr[i] // mid
    if count >= N:
        start = mid + 1
    else:
        end = mid - 1
# 최대 랜선의 길이 출력
print(end)
