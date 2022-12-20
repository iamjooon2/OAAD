import sys

N = int(sys.stdin.readline())
S = set()

for i in range(N):
    arr = sys.stdin.readline().strip().split()

    if len(arr) == 1:
        if arr[0] == 'all':
            S = set([j for j in range(1, 21)])
        else:
            S = set()
    else:
        operand = arr[0]
        num = int(arr[1])

        if operand == 'add':
            S.add(num)
        elif operand == 'remove':
            S.discard(num)
        elif operand == 'check':
            if num in S:
                print(1)
            else:
                print(0)
        elif operand == 'toggle':
            if num in S:
                S.discard(num)
            else:
                S.add(num)