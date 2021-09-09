n = int(input())
nums = list(map(int, input().split()))
prime_num = 0

for i in nums:
    count=0
    if (i==1):
        continue
    for j in range(2,i+1):
        if (i%j==0):
            count+=1
    if (count==1):
        prime_num+=1
print(prime_num)