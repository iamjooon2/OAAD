N = int(input())

numbers = list(map(int, input().split()))

count = 0
for i in numbers:
    if N == i:
        count += 1

print(count)

