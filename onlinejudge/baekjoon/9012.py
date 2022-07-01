N = int(input())

for i in range(N):
    stack = []
    is_vps = True
    for ch in input():
        if ch == '(':
            stack.append(ch)
        else:
            if stack:
                stack.pop()
            else:
                is_vps = False
                break
    if stack:
        is_vps = False

    if is_vps:
        print('YES')
    else:
        print('NO')