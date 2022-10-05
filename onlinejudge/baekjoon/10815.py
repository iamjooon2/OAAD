N = int(input())
count_nums = list(map(int, input().split()))

M = int(input())
check_nums = list(map(int, input().split()))

arr = []

for i in range(M):
    # 비교를 위해서 check_nums와 같은 사이즈의 리스트를 생성한다
    arr.append(0)

count_nums.sort()

# 2진 탐색을 이용한 풀이
for i in range(M):
    start = 0
    end = len(count_nums) - 1

    while start <= end:
        mid = (start + end) // 2

        if count_nums[mid] == check_nums[i]:
            arr[i] = 1
            break
        elif count_nums[mid] < check_nums[i]:
            start = mid + 1
        else:
            end = mid - 1

for i in arr:
    print(i, end=" ")