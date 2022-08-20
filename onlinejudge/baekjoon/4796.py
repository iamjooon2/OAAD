count = 1
while True:
    L, P, V = map(int, input().split())

    # 마지막 입력일때는
    if L + P + V == 0:
        # 종료하기
        break
    else:
        # 온전히 L일을 이용할 수 있을 때
        if V % P > L:
            result = ((V // P) * L) + L
        # 온전히 이용 못할때
        else:
            result = ((V // P) * L) + (V % P)
        print('Case %d: %d'% (count, result))
        count += 1
