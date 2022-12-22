n, m = map(int, input().split())

a = set()
b = set()

for i in range(n):
    k = input()
    a.add(k)

for i in range(n):
    k = input()
    b.add(k)

result = sorted(list(a&b))

print(len(result))

for i in result:
    print(i)