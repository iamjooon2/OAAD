count = int(input())
stk = [] # 스택 리스트

for i in range(count):
    num = int(input())
    if num == 0:
        stk.pop()
    else:
        stk.append(num)

print(sum(stk))