n = int(input())

for _ in range(n):
    clothes = {}
    counts = int(input())
    for _ in range(counts):
        v, k = input().split()
        if clothes.get(k) == None:
            clothes[k] = set()
        clothes[k].add(v)

    answer = 1
    for i in clothes.keys():
        answer *= len(clothes[i]) + 1
    # 아무 것도 입지 않는 경우의 수 제외
    print(answer - 1)
