N = int(input())

answer = 0
for i in range(N):
    school, apple = map(int, input().split())
    answer = answer + (apple%school)

print(answer)