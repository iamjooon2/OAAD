sum_num=0
for i in list(map(int, input().split())):
    sum_num += i**2
print(sum_num%10)
