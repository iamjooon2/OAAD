N = int(input())
arr = []
for _ in range(N):
    arr.append(list(map(str, input().split())))

for i in range(N):
    arr[i][0] = int(arr[i][0])

arr.sort(key= lambda x: x[0])

for j in arr:
    print(j[0], j[1])