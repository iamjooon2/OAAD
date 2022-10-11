array = [3, 5, 2, 11, 4, 7, 13]

for i in range(len(array) - 1, 0, -1):
    # i번 반복
    for j in range(i):
        # j번째 요소가 j+1번째 요소보다 더 크다면 위치 변경
        if array[j] > array[j + 1]:
            array[j], array[j + 1] = array[j + 1], array[j]

print(array)
