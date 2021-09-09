gcd = 1
a,b = map(int,input().split())
i = 2

while (i<=min(a,b)):
    if a % i ==0 and b%i ==0:
        gcd=i
    i+=1

print(gcd)