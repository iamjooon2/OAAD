S = input()
answer = set()

for i in range(len(S)):
    for j in range(i, len(S)):
        temp = S[i:j+1]
        answer.add(temp)

print(len(answer))