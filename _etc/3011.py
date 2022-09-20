num = int(input())
array = list(map(int, input().split()))
count = 0

for i in range(num):
    change = False
    for j in range(num-i-1):
        if array[j] > array[j+1]:
            array[j], array[j+1] = array[j+1], array[j]
            change = True
    if change:
        count += 1
print(count)
