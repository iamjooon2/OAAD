# 기타줄
N, M = map(int, input().split())

package = []
single = []
for i in range(M):
    arr = list(map(int, input().split()))
    package.append(arr[0])
    single.append(arr[1])

pack = min(package)
one = min(single)

# 낱개 6개 사는게 묶음보다 가격 좋을 때
if pack > one * 6:
    print(N * one)
# 묶음 가격이 낱개 6개 구매보다 좋을 때
else:
    # 묶음으로 다 사버리고 남은 낱개를 일일히 사는 것 보다 묶음 구매가 더 효과적이라면
    if (N % 6) * one < pack:
        print(((N // 6) * pack) + ((N % 6) * one))
    # 묶음으로 먼저 구매하고 남은거 낱개 구매할 때
    else:
        print(((N // 6) + 1) * pack)