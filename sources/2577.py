a = int(input())
b = int(input())
c = int(input())

result = a*b*c
abc_list = list(map(int, str(result)))

for i in range(10):
    print(abc_list.count(i))
