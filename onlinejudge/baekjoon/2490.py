for i in range(3):
    scores = list(map(int, input().split()))
    count = 0
    for j in scores:
        if j == 0:
            count += 1
    if count == 1: print('A')
    elif count == 2: print('B')
    elif count == 3: print('C')
    elif count == 4: print('D')
    else: print('E')
