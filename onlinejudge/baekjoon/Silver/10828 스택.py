import sys

n = int(sys.stdin.readline())

stack = []

for i in range(n):
    temp = list(map(str, sys.stdin.readline().split()))
    order = temp[0]
    # push 명령일 때
    if len(temp) > 1 and order == "push":
        stack.append(int(temp[1]))
    # pop 명령일 때
    elif order == "pop":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    # size 명령일 때
    elif order == "size":
        print(len(stack))
    # empty 명령일 때
    elif order == "empty":
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    # top 명령일 때
    elif order == "top":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])