n, m = map(int, input().split())
village = []

for i in range(n):
    line = list(map(int, input().split()))
    village.append(line)

if m == 0:
    print(max(map(max, village)))
elif m == 1:
    max_mosquito = 0
    for i in range(n):
        for j in range(n):
            # check for crossing
            temp = 0
            temp += village[i][j]
            if i != 0:
                temp += village[i-1][j]
            if i != n-1:
                temp += village[i+1][j]
            if j != n-1:
                temp += village[i][j+1]
            if j != 0:
                temp += village[i][j-1]

            if max_mosquito < temp:
                max_mosquito = temp

            # check for x-line
            temp = 0
            temp += village[i][j]
            if i != 0 and j != 0:
                temp += village[i-1][j-1]
            if j != n-1 and i != n-1:
                temp += village[i+1][j+1]
            if i != n-1 and j != 0:
                temp += village[i+1][j-1]
            if j != n-1 and i != 0:
                temp += village[i-1][j+1]

            if max_mosquito < temp:
                max_mosquito = temp
    print(max_mosquito)
else:
    for i in range(n):
        for j in range(n):
            temp = 0