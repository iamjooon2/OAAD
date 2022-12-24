n, m = map(int, input().split())

a = set()
for _ in range(n):
    i = input()
    a.add(i)

b = set()
for _ in range(n):
    j = input()
    b.add(j)

result = sorted(list(a&b))
print(len(result))

for k in result:
    print(k)