
n, k = map(int, input().split())

# N * N-1 * ...
num1 = 1
for i in range(k):
    num1 *= n - i

def factorial(a):
    if a < 2:
        return 1
    else:
        return a * factorial(a - 1)

num2 = factorial(k)

print(num1 // num2)
