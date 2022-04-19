heights = []

tmp1, tmp2 = 0,0

for _ in range(9):
    a = int(input())
    heights.append(a)

for i in range(9):
    for j in range(i+1, 9):
        if sum(heights) - (heights[i]+heights[j]) == 100:
            tmp1 = heights[i]
            tmp2 = heights[j]

heights.remove(tmp1)
heights.remove(tmp2)

heights.sort()
for n in range(7):
    print(heights[n])