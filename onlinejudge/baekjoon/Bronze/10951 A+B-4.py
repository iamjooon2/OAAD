#다른 조건이 주어지지 않음.. try-catch로 해결하기

while (True):
    try:
        a, b = map(int, input().split())
        print(a+b)
    except:
        break;