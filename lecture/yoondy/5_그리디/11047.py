# 동전 풀기
N, K = map(int, input().split())
coins = []
for _ in range(N):
    coins.append(int(input()))
coins.reverse()
ans = 0
for i in coins:
    ans += K // i
    K %= i

print(ans)