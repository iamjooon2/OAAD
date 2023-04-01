a, b = map(int, input().split())
c, d = map(int, input().split())
e, f = map(int, input().split())

x = 0
if a == c:
    x = e
elif a == e:
    x = c
else:
    x = a

y = 0
if b == d:
    y = f
elif b == f:
    y = d
else:
    y = b

print(x, y)
