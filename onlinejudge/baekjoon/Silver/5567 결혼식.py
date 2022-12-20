import sys
input = sys.stdin.readline

N = int(input())
M = int(input())
res = dict()
resSet = set()

for _ in range(M):
    key, item = map(int, input().split())
    if key not in res:
        res[key] = list()
    if item not in res:
        res[item] = list()
    res[key].append(item)
    res[item].append(key)
    
for key in res[1]:
    resSet.add(key)
    if key not in res:
        continue
    else:
        for item in res[key]:
            resSet.add(item)

print(len(resSet) - 1)