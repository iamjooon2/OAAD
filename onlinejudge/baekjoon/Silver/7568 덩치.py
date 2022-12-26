n = int(input())
physic_spec = []
for _ in range(n):
    weight, height = map(int, input().split())
    physic_spec.append([weight, height])

for i in physic_spec:
    rank = 1
    for j in physic_spec:
        if i[0] < j[0] and i[1] < j[1]:
            rank += 1
    print(rank, end=' ')
