import sys

N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

S = 0
for i in range(N):
    S += min(A)*max(B)
    A.remove(min(A))
    B.remove(max(B))
print(S)