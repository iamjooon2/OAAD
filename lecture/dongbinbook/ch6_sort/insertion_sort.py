array = [7,5,9,0,3,1,6,2,4,8]

for i in range(len(array)):
    for j in range(i, 0, -1): #인덱스 i부터 1까지 감소하며 반복
        if array[j] < array[j-1]:
            array[j], array[j-1] = array[j-1], array[j] #swap
        else:
            break

print(array)
#range(start, end, step)