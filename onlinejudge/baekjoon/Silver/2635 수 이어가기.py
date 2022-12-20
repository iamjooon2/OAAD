N = int(input())

max_arr = []
for i in range(1, N + 1):
    arr = [N]
    arr.append(i)

    idx = 0
    while True:
        next_num = arr[idx] - arr[idx + 1]

        if next_num < 0:
            break
        arr.append(next_num)
        idx += 1
    if (len(max_arr) < len(arr)):
        max_arr = arr

print(len(max_arr))
for i in max_arr:
    print(i, end = ' ')
