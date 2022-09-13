array = [7,5,9,0,3,1,6,2,4,8]

for i in range(len(array)):
    # 인덱스 i부터 1까지 감소하며 반복
    for j in range(i, 0, -1):
        # 한 칸씩 왼쪽으로 이동하며
        if array[j] < array[j-1]:
            # 위치 변경
            array[j], array[j-1] = array[j-1], array[j]
        # 자기 자신보다 작은 원소를 만나면 그 위치에서 멈춘다
        else:
            break

print(array)