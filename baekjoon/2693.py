N = int(input())

for i in range(N):
    nums = list(map(int, input().split()))
    nums.sort()
    print(nums[7])