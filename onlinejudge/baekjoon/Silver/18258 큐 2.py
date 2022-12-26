import sys
# 큐 구현을 위한 deque
from collections import deque

list = deque([])
for i in range(int(sys.stdin.readline())):
    x = sys.stdin.readline().split()
    num = x[0]
    if num == 'push':
        list.append(num)
    elif num == 'pop':
        if len(list) != 0:
            print(list.popleft())
        else:
            print(-1)
    elif num == 'size':
        print(len(list))
    elif num == 'empty':
        if len(list) != 0:
            print(0)
        else:
            print(1)
    elif num == 'front':
        if len(list) != 0:
            print(list[0])
        else:
            print(-1)
    else:
        if len(list) != 0:
            print(list[-1])
        else:
            print(-1)