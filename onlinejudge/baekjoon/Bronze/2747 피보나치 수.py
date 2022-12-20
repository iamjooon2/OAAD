N = int(input())
a = 0
b = 1
for i in range(N):
    tmp = b
    b = a + b
    a = tmp
print(a)