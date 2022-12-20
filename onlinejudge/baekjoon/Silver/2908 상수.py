a, b = input().split()

c = ''
d = ''

for i in range(len(a)):
    c += a[len(a)-1-i]

for i in range(len(b)):
    d += b[len(b)-1-i]

if int(c) > int(d):
    print(c)
else:
    print(d)
